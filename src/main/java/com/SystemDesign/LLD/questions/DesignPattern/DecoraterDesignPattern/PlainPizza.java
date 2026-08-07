package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
       return "Plain Pizza";
    }

    @Override
    public double getPrice() {
        return 200.0;
    }
}
