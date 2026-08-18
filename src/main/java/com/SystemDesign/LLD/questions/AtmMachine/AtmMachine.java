package com.SystemDesign.LLD.questions.AtmMachine;

public class AtmMachine {
    public AtmState atmState;
    public AtmCard currentCard;
    public InMemoryDB db;

    public AtmMachine() {
        this.atmState = new IdleState();
        this.db=new InMemoryDB();
    }

    public void setAtmCurrentCard(AtmCard card) {
        this.currentCard = card;
    }

    public void setAtmState(AtmState newState) {
        this.atmState = newState;

    }

    public void clearSession(){
        this.currentCard=null;
    }

    public void registerUser(BankAccount account){
        db.registerUser(account);
    }

    public void insertCard(AtmCard card){
        atmState.insertCard(this,card);
    }

    public void enterPin(String password){
        atmState.enterPassword(this,password);
    }

    public void withdrawAmount(double amount){
        atmState.enterWithdrawAmount(this,amount);
    }

    public void ejectCard(){
        atmState.ejectCard(this);
    }
}
