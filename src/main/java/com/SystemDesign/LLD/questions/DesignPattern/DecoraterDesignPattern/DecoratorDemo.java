package com.SystemDesign.LLD.questions.DesignPattern.DecoraterDesignPattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("======= Decorator Design Pattern ======");
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + " = Rs." + pizza1.getPrice());

        BasePizza pizza2 = new ExtraCheeseTopping(new PlainPizza());
        System.out.println("Order 2: " + pizza2.getDescription() + " = Rs." + pizza2.getPrice());

        BasePizza pizza3 = new VeggiesTopping(new
                ExtraCheeseTopping(new PlainPizza()));
        System.out.println("Order 3: " + pizza3.getDescription() + " = Rs." + pizza3.getPrice());

        BasePizza pizza6 = new FarmHousePizza();
        System.out.println("Order 6: " + pizza6.getDescription() + " = Rs." + pizza6.getPrice());

        BasePizza pizza7 = new VeggiesTopping(new
                ExtraCheeseTopping(new FarmHousePizza()));
        System.out.println("Order 7: " + pizza7.getDescription() + " = Rs." + pizza7.getPrice());
    }
}
