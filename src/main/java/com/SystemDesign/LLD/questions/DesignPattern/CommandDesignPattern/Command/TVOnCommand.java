package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;

public class TVOnCommand implements Command {
    private final Appliance appliance;

    public TVOnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.on();
    }
}
