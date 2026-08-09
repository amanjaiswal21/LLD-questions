package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Appliance;
import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.TV;
import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command.Command;
import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command.TVOffCommand;
import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command.TVOnCommand;

public class RemoteControllerDemo {
    public static void main(String[] args) {
        RemoteController remoteController=new RemoteController();
        Appliance appliance=new TV();
        Command command1=new TVOnCommand(appliance);
        Command command2=new TVOffCommand(appliance);
        remoteController.setCommand(command1);
        remoteController.pressButton();
        remoteController.setCommand(command2);
        remoteController.pressButton();

    }
}
