package com.org.model.service;

import java.util.List;
import java.util.stream.Collectors;

import com.org.exception.AccountNotFoundException;
import com.org.exception.InsufficientBalanceException;
import com.org.model.beans.Account;
import com.org.model.dao.AccountDao;
import com.org.model.util.ObjectFactory;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao = null;

	public AccountServiceImpl() {
		accountDao = ObjectFactory.getAccountDaoInstance();
	}

	@Override
	public Account createAccount(Account account) {
		return accountDao.createAccount(account);
	}

	@Override
	public double getBalance(int accountNumber) throws AccountNotFoundException {

		if (accountDao.getAccount(accountNumber) != null) {
			Account acc = accountDao.getAccount(accountNumber);
			return acc.getBalance();
		} else {
			throw new AccountNotFoundException("Account not found");
		}

	}

	@Override
	public List<Account> getAccountsSortedByName() {
		List<Account> accounts = accountDao.getAccounts();
		List<Account> sortedAccount = accounts.stream()
				.sorted((account1, account2) -> account1.getCustomerName().compareTo(account2.getCustomerName()))
				.collect(Collectors.toList());
		return sortedAccount;
	}

	@Override
	public List<Account> getAccountsSortedByAccountNumber() {
		List<Account> accounts = accountDao.getAccounts();
		List<Account> sortedAccount = accounts.stream()
				.sorted((account1, account2) -> account1.getAccountNumber() - account2.getAccountNumber())
				.collect(Collectors.toList());
		return sortedAccount;
	}

	@Override
	public void debit(int sourceAccountNumber, int destincationAccountNumber, double amount)
			throws InsufficientBalanceException, AccountNotFoundException {

		Account sourceAcc = accountDao.getAccount(sourceAccountNumber);
		Account destAcc = accountDao.getAccount(destincationAccountNumber);

		if (amount > 0 && sourceAcc != null) {
			if (destAcc != null) {
				if (sourceAcc.getBalance() >= amount) {
					accountDao.updateBalance(sourceAccountNumber, sourceAcc.getBalance() - amount);
					accountDao.updateBalance(destincationAccountNumber, destAcc.getBalance() + amount);

				} else {
					// throw less bank balance exception
					throw new InsufficientBalanceException("Insufficeint account balance to perform transaction");
				}
			} else {
				// throw account not found exception
				throw new AccountNotFoundException("Account not found for account number:" + destincationAccountNumber);
			}

		} else {
			// throw account not found exception
			throw new AccountNotFoundException("Account not found for account number:" + sourceAccountNumber);
		}

	}

	@Override
	public void credit(int sourceAccountNumber, int destincationAccountNumber, double amount)
			throws InsufficientBalanceException, AccountNotFoundException {

		Account sourceAcc = accountDao.getAccount(sourceAccountNumber);
		Account destAcc = accountDao.getAccount(destincationAccountNumber);

		if (amount > 0 && sourceAcc != null) {

			if (destAcc != null) {
				if (destAcc.getBalance() >= amount) {
					accountDao.updateBalance(destincationAccountNumber, destAcc.getBalance() - amount);
					accountDao.updateBalance(sourceAccountNumber, sourceAcc.getBalance() + amount);

				} else {
					// throw less bank balance exception
					throw new InsufficientBalanceException("Insufficeint account balance to perform transaction");
				}
			} else {
				throw new AccountNotFoundException("Account not found for account number:" + destincationAccountNumber);
			}

		} else {
			// throw account not found exception
			throw new AccountNotFoundException("Account not found for account number:" + sourceAccountNumber);

		}

	}

	@Override
	public void deleteAccount(int accountNumber) throws AccountNotFoundException {

		if (accountDao.getAccount(accountNumber) != null) {
			accountDao.deleteAccount(accountNumber);
		} else {
			throw new AccountNotFoundException("Account not found");

		}
	}

}
