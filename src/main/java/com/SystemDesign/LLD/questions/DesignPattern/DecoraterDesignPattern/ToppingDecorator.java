package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public abstract class ToppingDecorator implements BasePizza {
    public BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
