package com.SystemDesign.LLD.questions.SplitWise;

import lombok.Data;

@Data
public class Split {
    private String userId;
    private double amount;

    public Split(String userId, double amount) {
        this.userId=userId;
        this.amount=amount;
    }
}
