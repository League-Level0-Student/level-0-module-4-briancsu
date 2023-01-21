package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		
		String a1 = JOptionPane.showInputDialog(null, "How many nickels do you have: ");
		
		double ans1 = Double.parseDouble(a1) * .05;
		
		String a2 = JOptionPane.showInputDialog(null, "How many dimes do you have: ");
		
		double ans2 = Double.parseDouble(a2) * 0.10;
		
		String a3 = JOptionPane.showInputDialog(null, "How many quarters do you have: ");
		
		double ans3 = Double.parseDouble(a3) * 0.25;
		// Ask the user how many dimes they have, and convert their answer
		double ans = ans1 + ans2 + ans3;
		// Ask the user how many quarters they have, and convert their answer
	
		
	
		// Calculate how much money the user has.  Hint: Use a double variable 
		System.out.println("You have $" + ans);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

