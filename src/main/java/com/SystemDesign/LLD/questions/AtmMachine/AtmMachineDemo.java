package com.SystemDesign.LLD.questions.AtmMachine;

public class AtmMachineDemo {
    public static void main(String[] args) {
        AtmMachine atmMachine=new AtmMachine();
        BankAccount account=new BankAccount("ac_01","Aman","atm_01","1234",900.0);
        AtmCard card=new AtmCard("atm_01","ac_01");
        atmMachine.registerUser(account);
        atmMachine.insertCard(card);
        atmMachine.enterPin("1234");
        atmMachine.withdrawAmount(100);
        atmMachine.ejectCard();


    }
}
