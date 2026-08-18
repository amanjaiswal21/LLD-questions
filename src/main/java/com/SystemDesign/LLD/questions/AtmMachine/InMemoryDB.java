package com.SystemDesign.LLD.questions.AtmMachine;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {
    public final Map<String,BankAccount>bankAccounts=new HashMap<>();

    public void registerUser(BankAccount bankAccount){
        bankAccounts.put(bankAccount.getAtmId(),bankAccount);
    }
}
