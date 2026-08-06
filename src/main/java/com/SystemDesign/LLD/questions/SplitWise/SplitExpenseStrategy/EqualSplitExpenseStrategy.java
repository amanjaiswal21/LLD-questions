package com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy;

import com.SystemDesign.LLD.questions.SplitWise.Split;
import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitExpenseStrategy implements SplitExpenseStrategy {
    @Override
    public List<Split> calculateSplit(double amount, List<User> users, List<Double> values) {
        List<Split> splits = new ArrayList<>();
        int totalUser = users.size();
        double amountPerUser = amount / totalUser;
        for (User user : users) {
            splits.add(new Split(user.getUserId(), amountPerUser));
        }
        return splits;
    }
}
