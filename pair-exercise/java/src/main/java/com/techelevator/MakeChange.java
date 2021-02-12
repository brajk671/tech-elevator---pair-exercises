package com.techelevator;

import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Total Bill Amount: ");
		String billStr = scanner.nextLine();
		double bill = Double.parseDouble(billStr);
		
		System.out.print("Total Amount Tendered: ");
		String tenderStr = scanner.nextLine();
		double tender = Double.parseDouble(tenderStr);
		
		double changeRequired = tender - bill;
		
		System.out.println("Your change is " + changeRequired);
	}

}
