package com.SystemDesign.LLD.questions.SplitWise;

import com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy.EqualSplitExpenseStrategy;
import com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy.ExactSplitExpenseStrategy;
import com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy.PercentageSplitExpenseStrategy;
import com.SystemDesign.LLD.questions.SplitWise.SplitExpenseStrategy.SplitExpenseStrategy;

public class SplitExpenseStrategyFactory {
    public SplitExpenseStrategy getSplitStrategy(SplitType type) {
        if (type == SplitType.EQUAL)
            return new EqualSplitExpenseStrategy();
        else if (type == SplitType.EXACT)
            return new ExactSplitExpenseStrategy();
        else if (type == SplitType.PERCENTAGE)
            return new PercentageSplitExpenseStrategy();

        throw new IllegalArgumentException("Invalid Split Type");
    }
}
