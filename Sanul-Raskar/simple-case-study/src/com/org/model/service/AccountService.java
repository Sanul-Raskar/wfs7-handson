package com.org.model.service;

import java.util.List;

import com.org.exception.AccountNotFoundException;
import com.org.exception.InsufficientBalanceException;
import com.org.model.beans.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public double getBalance(int accountNumber) throws AccountNotFoundException;
	public void debit(int sourceAccount, int destincationAccount, double amount) throws InsufficientBalanceException,AccountNotFoundException;
	public void credit(int sourceAccount, int destincationAccount, double amount) throws InsufficientBalanceException,AccountNotFoundException;
	public List<Account> getAccountsSortedByName();
	public List<Account> getAccountsSortedByAccountNumber();
	public void deleteAccount(int accountNumber) throws AccountNotFoundException;
}
