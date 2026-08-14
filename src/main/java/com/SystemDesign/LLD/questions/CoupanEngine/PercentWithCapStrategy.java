package com.SystemDesign.LLD.questions.CoupanEngine;

public class PercentWithCapStrategy implements DiscountStrategy{
    private double capAmount;
    private double discountPercentage;

    public PercentWithCapStrategy(double capAmount,double discountPercentage){
        this.capAmount=capAmount;
        this.discountPercentage=discountPercentage;
    }

    @Override
    public double calculate(double amount) {
       double percentageDiscountAmount=(amount*discountPercentage)/100;
       return Math.min(capAmount,percentageDiscountAmount);
    }
}
