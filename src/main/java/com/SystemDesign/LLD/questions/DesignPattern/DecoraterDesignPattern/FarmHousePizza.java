package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public class FarmHousePizza implements BasePizza {
    @Override
    public String  getDescription() {
       return "Farmhouse Pizza";
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
