package com.musi.testspractice.interest;

/**
 * @author Factm
 */
public interface InterestCalculator {
    void setRate(double rate);
    double calculate(double amount, double year);
}
