package com.org.model.dao;

import java.util.List;

import com.org.model.beans.Account;

public interface AccountDao {
	public Account createAccount(Account account);
	public Account updateBalance(int accountNumber, double amount);
	public Account getAccount(int accountNumber);
	public List<Account> getAccounts();
	public void deleteAccount(int accountNumber);
}
