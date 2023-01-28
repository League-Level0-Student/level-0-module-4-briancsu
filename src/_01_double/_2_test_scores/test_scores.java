package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "What is your test score: ");
	double ans = Double.parseDouble(answer);
	if (ans > 85) {
		System.out.println("Great job!");
	}
	else if (ans > 65 & ans < 85) {
		System.out.println("Pretty good!");
	}
	else {
		System.out.println("Try harder next time.");
		
	}
	
	
	
}
}
