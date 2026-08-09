package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;

public class LightOnCommand implements Command {
    private final Appliance appliance;

    public LightOnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.on();
    }
}
