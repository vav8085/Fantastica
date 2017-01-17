package com.vav.TDD;

import java.math.BigDecimal;

/**
 * Created by Vaibhav on 1/13/2017.
 */
public class Calculator {
    private BigDecimal value = BigDecimal.ZERO;
    public BigDecimal getAccumulator() {
        return value;
    }

    public void setAccumulator(BigDecimal bigDecimal) {
        value = bigDecimal;
    }
}
