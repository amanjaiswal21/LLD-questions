package com.SystemDesign.LLD.questions.AtmMachine;

public class IdleState implements AtmState {
    @Override
    public void insertCard(AtmMachine atmMachine, AtmCard card) {
        if (card == null) {
            System.out.println("enter the card, card is not valid");
            return;
        }
        boolean atmCardFound = atmMachine.db.bankAccounts.containsKey(card.getAtmId());
        if (!atmCardFound) {
            System.out.println("Card is not recognized");
            return;
        }
        atmMachine.setAtmCurrentCard(card);
        System.out.println("Card inserted successfully");
        atmMachine.setAtmState(new CardInsertedState());

    }

    @Override
    public void enterPassword(AtmMachine atmMachine, String pin) {
        System.out.println("Please enter card first");
    }

    @Override
    public void enterWithdrawAmount(AtmMachine atmMachine, double amount) {
        System.out.println("Please enter card first");
    }

    @Override
    public void ejectCard(AtmMachine machine) {
        System.out.println("No card is present");
    }
}
