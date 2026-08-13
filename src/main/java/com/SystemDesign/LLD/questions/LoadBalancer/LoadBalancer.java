package com.SystemDesign.LLD.questions.LoadBalancer;

import java.util.List;

public class LoadBalancer {
    public List<Destination> destinations;
    public LoadBalancerStrategy loadBalancerStrategy;

    public LoadBalancer(List<Destination> destinations,LoadBalancerStrategy loadBalancerStrategy) {
        this.destinations = destinations;
        this.loadBalancerStrategy=loadBalancerStrategy;
    }

    public Destination handleRequest(){
        return loadBalancerStrategy.getDestination(destinations);
    }

}
