package com.SystemDesign.LLD.questions.LoadBalancer;

import java.util.List;

public interface LoadBalancerStrategy {
     Destination getDestination(List<Destination> destinations);
}
