package com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy;

import com.SystemDesign.LLD.questions.SplitWise.Split;
import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.ArrayList;
import java.util.List;

public class ExactSplitExpenseStrategy implements SplitExpenseStrategy {
    @Override
    public List<Split> calculateSplit(double amount, List<User> users, List<Double> values) {
        List<Split> splits = new ArrayList<>();
        int totalUser=users.size();
        for(int i=0;i<totalUser;i++){
            User user=users.get(i);
            double userAmount = values.get(i);
            splits.add(new Split(user.getUserId(),userAmount));
        }
        return splits;
    }
}
