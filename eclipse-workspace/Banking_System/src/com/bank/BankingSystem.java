package com.bank;

import java.util.Scanner;

public class BankingSystem {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter Account Number:");
	        String accountNumber = scanner.nextLine();

	        System.out.println("Enter Initial Balance:");
	        double initialBalance = scanner.nextDouble();

	        System.out.println("Enter Account Holder's Name:");
	        scanner.nextLine(); // Consume the newline character left by nextDouble()
	        String accountHolderName = scanner.nextLine();

	        System.out.println("Enter Email Address:");
	        String emailAddress = scanner.nextLine();

	        System.out.println("Enter Phone Number:");
	        String phoneNumber = scanner.nextLine();

	        // Create an instance of AccountDetails with the entered details
	        AccountDetails account = new AccountDetails(accountNumber, initialBalance, accountHolderName, emailAddress, phoneNumber);

	        // Display the initial account details
	        displayAccountDetails(account);

	        // Perform deposit and withdrawal operations
	        account.DepoistMoney(1000); // Example deposit
	        account.withdraw(500);      // Example withdrawal

	        // Display the updated account details
	        displayAccountDetails(account);

	        scanner.close();
	    }

	    private static void displayAccountDetails(AccountDetails account) {
	        System.out.println("\nAccount Details:");
	        System.out.println("Account Number: " + account.getNumber());
	        System.out.println("Balance: " + account.getBalance());
	        System.out.println("Account Holder's Name: " + account.getName());
	        System.out.println("Email Address: " + account.getEmail());
	        System.out.println("Phone Number: " + account.getPhoneNumber());
	    }
	}


