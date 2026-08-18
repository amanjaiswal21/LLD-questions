package com.SystemDesign.LLD.questions.AtmMachine;

import lombok.Data;

@Data
public class AtmCard {
    private final String atmId;
    private final String bankId;

    public AtmCard(String atmId, String bankId) {
        this.atmId = atmId;
        this.bankId = bankId;
    }

}
