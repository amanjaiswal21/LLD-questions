package com.SystemDesign.LLD.questions.SplitWise;

import lombok.Data;

import java.util.Map;

@Data
public class User implements Observer{
    private final String userId;
    private final String name;
    private final String email;
    private final Map<String, Double> balances;

    public User(String userId, String name, String email, Map<String, Double> balances) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.balances = balances;
    }

    @Override
    public void update(String message) {
        System.out.println("Some user has settle or add the expenses");
    }
}
