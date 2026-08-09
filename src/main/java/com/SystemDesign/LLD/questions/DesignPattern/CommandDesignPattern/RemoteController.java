package com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Command.Command;

public class RemoteController {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}
