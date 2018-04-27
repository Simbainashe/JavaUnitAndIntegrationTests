package com.musi.testspractice.account;

/**
 * @author Fact S Musingarimi
 */
public interface AccountDao {
    void createAccount(Account account);
    void updateAccount(Account account);
    void  removeAccount(Account account);
    Account findAccount(String accountNo);
}
