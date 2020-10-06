package com.org.controller;

import java.util.List;
import java.util.Scanner;

import com.org.exception.AccountNotFoundException;
import com.org.exception.InsufficientBalanceException;
import com.org.model.beans.Account;
import com.org.model.service.AccountService;
import com.org.model.util.ObjectFactory;

public class MainViewController {

	public static void main(String[] args) {
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		AccountService service = ObjectFactory.getAccountServiceInstance();
		do {
			System.out.println(
					"1: Create Account\n2: Check Balance\n3: Transfer Amount\n4: Sort Accounts by name\n5: Sort Accounts by account number\n6. Delete Account\n0: Exit");
			option = scanner.nextInt();
			List<Account> list = null;
			switch (option) {
			case 1:
				System.out.println("Enter name");
				Account account = new Account(scanner.next());
				Account createdAccount = service.createAccount(account);
				System.out.println(createdAccount);
				break;

			case 2:
				System.out.println("Enter account number");
				int accNum = scanner.nextInt();
				try {
					double balance = service.getBalance(accNum);
					System.out.println("Balance: " + balance);
				} catch (AccountNotFoundException e1) {
					System.out.println(e1.getMessage());
				}

				break;
			case 3:
				System.out.println("Select an option\n1.Debit\n2.Credit");
				int opt = scanner.nextInt();

				if (opt == 1) {
					System.out.println("Enter Source account number");
					int sourceAcc = scanner.nextInt();
					System.out.println("Enter Destination account number");
					int desAcc = scanner.nextInt();
					System.out.println("Enter account to transfer");
					int transferAmt = scanner.nextInt();

					try {
						service.debit(sourceAcc, desAcc, transferAmt);
					} catch (InsufficientBalanceException | AccountNotFoundException e) {

						System.out.println(e.getMessage());
					}

				} else if (opt == 2) {
					System.out.println("Enter Source account number");
					int sourceAcc = scanner.nextInt();
					System.out.println("Enter Destination account number");
					int desAcc = scanner.nextInt();
					System.out.println("Enter account to transfer");
					int transferAmt = scanner.nextInt();

					try {
						service.credit(sourceAcc, desAcc, transferAmt);
					} catch (InsufficientBalanceException | AccountNotFoundException e) {
						System.out.println(e.getMessage());
					}
				}

				break;

			case 4:
				list = service.getAccountsSortedByName();
				list.forEach(acc -> System.out.println(acc));
				break;

			case 5:
				list = service.getAccountsSortedByAccountNumber();
				list.forEach(acc -> System.out.println(acc));
				break;

			case 6:
				System.out.println("Enter account number to delete");
				int delAcc = scanner.nextInt();
				try {
					service.deleteAccount(delAcc);
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (option != 0);

		scanner.close();
	}

}
