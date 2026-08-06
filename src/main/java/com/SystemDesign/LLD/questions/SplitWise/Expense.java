package com.SystemDesign.LLD.questions.SplitWise;

import lombok.Data;

import java.util.List;

@Data
public class Expense {
    private String expenseId;
    private String description;
    private String paidByUserId;
    private String groupId;
    private List<Split>splits;

}
