package com.SystemDesign.LLD.questions.AtmMachine;

public class CardInsertedState implements AtmState{

    @Override
    public void insertCard(AtmMachine atmMachine, AtmCard card) {
        System.out.println("card is alrady inserted");
    }

    @Override
    public void enterPassword(AtmMachine atmMachine, String pin) {
      String password=atmMachine.db.bankAccounts.get(atmMachine.currentCard.getAtmId()).getAtmPassword();
      if(pin.equals(password)){
          atmMachine.setAtmState(new AuthorizedState());
          System.out.println("card is authorized");
          return;
      }
      System.out.println("Pin is incorrect");
    }

    @Override
    public void enterWithdrawAmount(AtmMachine atmMachine, double amount) {
        System.out.println("first authenticate first");
    }

    @Override
    public void ejectCard(AtmMachine machine) {
        System.out.println("first authenticate first");
    }
}
