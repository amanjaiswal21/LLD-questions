package com.SystemDesign.LLD.questions.AtmMachine;

public interface AtmState {
    void insertCard(AtmMachine atmMachine, AtmCard card);
    void enterPassword(AtmMachine atmMachine, String pin);
    void enterWithdrawAmount(AtmMachine atmMachine, double amount);
    void ejectCard(AtmMachine machine);
}
