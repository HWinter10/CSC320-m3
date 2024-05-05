package application;

import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class averageWithholding {
	private static DecimalFormat df2 = new DecimalFormat("###");
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		double weeklyIncome;
		char ch = 'y';
		
		while(ch == 'y'|| ch == 'Y') 
		{
	
	double tax = 0;
	System.out.print("Enter your weekly income: ");
	weeklyIncome = scanner.nextDouble();
	
	if (weeklyIncome < 500)
		tax = 0.1*weeklyIncome;
	else if (weeklyIncome >= 500 && weeklyIncome < 1500)
		tax = 0.15*weeklyIncome;
	else if (weeklyIncome >= 1500 && weeklyIncome < 2500)
		tax = 0.2*weeklyIncome;
	else if (weeklyIncome >= 2500)
		tax = 0.3*weeklyIncome;
	
	System.out.println("Average weekly tax $" + df2.format(tax));
	System.out.println("\nWant to calculate more? (y/n): ");
	ch = scanner.next().charAt(0);
		}
	}
}