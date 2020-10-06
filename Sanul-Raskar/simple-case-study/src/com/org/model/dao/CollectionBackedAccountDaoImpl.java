package com.org.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.org.model.beans.Account;

public class CollectionBackedAccountDaoImpl implements AccountDao {

	private static List<Account> database = new ArrayList<>();

	@Override
	public Account createAccount(Account account) {
		database.add(account);
		return account;
	}

	@Override
	public Account updateBalance(int accountNumber, double amount) {

		Account acc = getAccount(accountNumber);
		if (acc != null) {
			acc.setBalance(amount);
			return acc;
		}

		return null;
	}

	@Override
	public Account getAccount(int accountNumber) {
		List<Account> account = null;

		account = database.stream().filter(acc -> acc.getAccountNumber() == accountNumber).distinct()
				.collect(Collectors.toList());

		if (account.size() != 0 && account != null) {
			return account.get(0);
		}

		return null;
	}

	@Override
	public List<Account> getAccounts() {
		return database;
	}

	@Override
	public void deleteAccount(int accountNumber) {
		for(int i = 0;i<database.size();i++) {
			Account acc = database.get(i);
			if(acc.getAccountNumber() == accountNumber) {
				database.remove(i);
			}
		}
		
	}

}
