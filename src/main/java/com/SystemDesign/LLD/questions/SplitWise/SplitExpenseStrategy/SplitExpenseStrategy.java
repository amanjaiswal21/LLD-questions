package com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy;

import com.SystemDesign.LLD.questions.SplitWise.Split;
import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.List;

public interface SplitExpenseStrategy {
    List<Split> calculateSplit(double amount, List<User> users, List<Double>values);
}
