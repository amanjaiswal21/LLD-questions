package com.SystemDesign.LLD.questions.LoadBalancer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeastConnectionLoadBalancerStrategy implements LoadBalancerStrategy {

    @Override
    public Destination getDestination(List<Destination> destinations) {
        return destinations.stream()
                .filter(Destination::canHandleRequest)
                .min(Comparator.comparingInt(Destination::getServingRequest))
                .orElseThrow(()->
                        new IllegalArgumentException("No destination is free")
                        );
    }
}
