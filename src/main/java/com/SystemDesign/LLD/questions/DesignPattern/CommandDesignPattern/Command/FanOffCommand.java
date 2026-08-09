package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;

public class FanOffCommand implements Command {
    private final Appliance appliance;

    public FanOffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.off();
    }
}
