package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances;

public class Light implements Appliance {
    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("Light is off");
    }
}
