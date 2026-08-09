package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances;

public class Fan implements Appliance {

    @Override
    public void on() {
        System.out.println("Fan is on");
    }

    @Override
    public void off() {
        System.out.println("Fan is off");
    }
}
