package com.homework.lesson9.StrategyPatternExmpl;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
