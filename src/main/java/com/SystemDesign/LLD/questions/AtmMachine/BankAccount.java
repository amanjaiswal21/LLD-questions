package com.SystemDesign.LLD.questions.AtmMachine;

import lombok.Data;

@Data
public class BankAccount {
    private final String accountId;
    private final String userName;
    private final String atmId;
    private final String atmPassword;
    private Double balance;

    public BankAccount(String bankId, String userName, String atmId, String atmPassword, Double balance) {
        this.accountId = bankId;
        this.userName = userName;
        this.atmId = atmId;
        this.atmPassword = atmPassword;
        this.balance = balance;
    }

    public boolean hasEnoughMoney(Double amount){
        return balance>=amount;
    }

    public void dispenceMoney(Double amount){
        if(! hasEnoughMoney(amount))
            throw new IllegalStateException(" user has not enough money");

        balance-=amount;
    }

}
