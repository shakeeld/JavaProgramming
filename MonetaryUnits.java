import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter a decimal dollar amount: ");
	double dollarAmount = input.nextDouble(); // enter the amount
	
	int centAmount = (int)(dollarAmount * 100); // total coins
	
	int dollars = centAmount / 100; // dollar amount
	
	int remainder = centAmount % 100; //remaining total change
	
	int quarters = remainder / 25; 
	
	remainder %= 25;
	
	int dimes = remainder / 10;
	
	remainder %= 10;
	
	int nickels = remainder / 5;
	
	remainder %= 5;
	
	int pennies = remainder;
	
	System.out.println("Here is the amount of $" + dollarAmount + " broken down: ");
	System.out.println("Dollars - " + dollars);
	System.out.println("Quarters - " + quarters);
	System.out.println("Dimes - " + dimes);
	System.out.println("Nickels - " + nickels);
	System.out.print("Pennies - " + pennies);
	
	
	
	}
	
}
