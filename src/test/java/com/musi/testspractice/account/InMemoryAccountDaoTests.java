package com.musi.testspractice.account;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Fact S Musingarimi
 */
public class InMemoryAccountDaoTests {

    private static final String EXISTING_ACCOUNT_NO = "1234";
    private static final String NEW_ACCOUNT_NO = "5678";
    private Account existingAccount;
    private Account newAccount;
    private InMemoryAccountDao accountDao;

    @Before
    public void init(){
        existingAccount = new Account(EXISTING_ACCOUNT_NO, 100);
        newAccount = new Account(NEW_ACCOUNT_NO, 200);
        accountDao = new InMemoryAccountDao();
        accountDao.createAccount(existingAccount);
    }

    @Test
    public void accountExists() {
        Assert.assertTrue(accountDao.accountExists(EXISTING_ACCOUNT_NO));
        Assert.assertFalse(accountDao.accountExists(NEW_ACCOUNT_NO));
    }

    @Test
    public void createNewAccount(){
        accountDao.createAccount(newAccount);
        Assert.assertEquals(newAccount,accountDao.findAccount(NEW_ACCOUNT_NO));
    }

    @Test(expected = DuplicateAccountException.class)
    public void createDuplicateAccount(){
        accountDao.createAccount(existingAccount);
    }

    @Test
    public void updateExistedAccount() {
        existingAccount.setBalance(150);
        accountDao.updateAccount(existingAccount);
        Assert.assertEquals(accountDao.findAccount(EXISTING_ACCOUNT_NO), existingAccount);
    }
}
