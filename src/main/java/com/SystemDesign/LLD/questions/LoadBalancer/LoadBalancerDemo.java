package com.SystemDesign.LLD.questions.LoadBalancer;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancerDemo {
    public static void main(String[] args) {
        List<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination("10.0.0.1", 10, 5));
        destinations.add(new Destination("10.0.0.2", 10, 2));
        destinations.add(new Destination("10.0.0.3", 10, 7));

        LoadBalancerStrategy strategy =
                new LeastConnectionLoadBalancerStrategy();

        LoadBalancer loadBalancer =
                new LoadBalancer(destinations, strategy);

        Destination destination = loadBalancer.handleRequest();

        destination.handleRequest();

        System.out.println(
                "Request sent to: " + destination.getIdAddress()
        );
    }
}
