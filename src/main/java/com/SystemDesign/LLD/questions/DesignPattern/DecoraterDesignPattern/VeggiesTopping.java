package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public class VeggiesTopping extends ToppingDecorator{
    public VeggiesTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "veggies topping";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+120;
    }
}
