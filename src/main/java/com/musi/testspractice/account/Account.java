package com.musi.testspractice.account;

import java.util.Objects;

/**
 * @author Fact S Musingarimi
 */
public class Account {

    private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(this.accountNo, account.accountNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.accountNo);
    }
}
