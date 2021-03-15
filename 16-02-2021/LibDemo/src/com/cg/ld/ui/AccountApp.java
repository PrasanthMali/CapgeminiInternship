package com.cg.ld.ui;

import java.util.Scanner;

import com.cg.ld.excep.BankException;
import com.cg.ld.model.Account;

public class AccountApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Account first = new Account(101, "srinivas", 15000);
			System.out.println("Enter amount to deposit : ");
			int amount = scan.nextInt();
			first.deposit(amount);
			System.out.println(first);

			System.out.println("Enter amount to withdraw : ");
			amount = scan.nextInt();
			try {
				first.withdraw(15400);
			} catch (BankException excep) {
				System.out.println(excep.getMessage());
				// excep.printStackTrace();
			}
			System.out.println(first);
		} catch (Exception excep) {
			System.out.println();
		} 

	}

}