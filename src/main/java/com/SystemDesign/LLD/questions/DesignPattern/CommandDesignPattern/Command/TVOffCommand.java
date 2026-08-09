package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;

public class TVOffCommand implements Command {
    private final Appliance appliance;

    public TVOffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.off();
    }
}
