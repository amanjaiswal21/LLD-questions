package com.SystemDesign.LLD.questions.AtmMachine;

public class DispensingState implements AtmState{
    @Override
    public void insertCard(AtmMachine atmMachine, AtmCard card) {
        System.out.println("A card is already inserted");
    }

    @Override
    public void enterPassword(AtmMachine atmMachine, String pin) {
        System.out.println("A card is already authorized");
    }

    @Override
    public void enterWithdrawAmount(AtmMachine atmMachine, double amount) {
        System.out.println("withdrawl is in progress");
    }

    @Override
    public void ejectCard(AtmMachine atmMachine) {
      System.out.println("Please collect your card");
        atmMachine.setAtmState(new IdleState());
        atmMachine.clearSession();
    }
}
