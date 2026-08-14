package com.SystemDesign.LLD.questions.CoupanEngine;

public class FlatDiscountStrategy implements DiscountStrategy {

    private double discountAmount;

    public FlatDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculate(double amount) {
        return Math.min(discountAmount, amount);
    }
}
