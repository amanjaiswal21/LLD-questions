package com.SystemDesign.LLD.questions.LoadBalancer;

import lombok.Data;

@Data
public class Destination {
    private final String idAddress;
    private final int threshold;
    private int servingRequest;

    public Destination(String idAddress, int threshold, int servingRequest) {
        this.idAddress = idAddress;
        this.threshold = threshold;
        this.servingRequest = servingRequest;
    }

    public boolean canHandleRequest(){
       return servingRequest<threshold;
    }

    public void handleRequest(){
        servingRequest++;
    }

    public void completeRequest(){
        servingRequest--;
    }

}
