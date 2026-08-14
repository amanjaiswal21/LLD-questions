package com.SystemDesign.LLD.questions.CoupanEngine;

public class PercentDiscountStrategy implements DiscountStrategy {
    private double discountPercentage;

    public PercentDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculate(double amount) {
        return (amount * discountPercentage) / 100;
    }
}
