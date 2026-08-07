package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public class ExtraCheeseTopping extends ToppingDecorator{
    public ExtraCheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
      return pizza.getDescription()+"Extra cheese Topping";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() +50;
    }
}
