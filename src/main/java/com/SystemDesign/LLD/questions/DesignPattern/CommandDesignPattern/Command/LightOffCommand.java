package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;

public class LightOffCommand implements Command {
    private final Appliance appliance;

    public LightOffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.off();
    }
}
