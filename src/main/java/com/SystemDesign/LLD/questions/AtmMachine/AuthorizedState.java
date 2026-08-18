package com.SystemDesign.LLD.questions.AtmMachine;

public class AuthorizedState implements AtmState{

    @Override
    public void insertCard(AtmMachine atmMachine, AtmCard card) {
        System.out.println("A card is already inserted");
    }

    @Override
    public void enterPassword(AtmMachine atmMachine, String pin) {
        System.out.println("User is already authenticated");
    }

    @Override
    public void enterWithdrawAmount(AtmMachine atmMachine, double amount) {
      BankAccount bankAccount=atmMachine.db.bankAccounts.get(atmMachine.currentCard.getAtmId());
      if(!bankAccount.hasEnoughMoney(amount)){
          System.out.println("User has not enough money");
          return;
      }
      else{
          bankAccount.dispenceMoney(amount);
          atmMachine.setAtmState(new DispensingState());
          return;
      }
    }

    @Override
    public void ejectCard(AtmMachine machine) {
        System.out.println("User is withdrawing a cash");
    }
}
