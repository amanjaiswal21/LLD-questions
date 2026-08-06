package com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy;

import com.SystemDesign.LLD.questions.SplitWise.Split;
import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.ArrayList;
import java.util.List;

public class PercentageSplitExpenseStrategy implements SplitExpenseStrategy {
    @Override
    public List<Split> calculateSplit(double amount, List<User> users, List<Double> values) {
        List<Split> splits = new ArrayList<>();
        double totalPercentage = 0;
        int totalUser = users.size();
        for (int i = 0; i < totalUser; i++) {
            User user = users.get(i);
            double userPercentage = values.get(i);
            totalPercentage += userPercentage;
            double userAmount = (userPercentage * amount) / 100;
            splits.add(new Split(user.getUserId(), userAmount));
        }
        if (totalPercentage != 100)
            throw new IllegalArgumentException("Percentage should sum to 100");

        return splits;
    }
}
