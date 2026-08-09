package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances;

public class TV implements Appliance {
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }
}
