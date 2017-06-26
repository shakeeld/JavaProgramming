import java.util.Scanner;

public class UpdatedMonetaryUnits {
	 
	public static int moneyAmount;
	
		public static void main(String[] args) {	
			
			
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Press 1 for Japanese Yen or 2 for US Dollars: ");
		int currency = input.nextInt();
		
		if (currency == 1) {
			
			System.out.print("Enter an integer Yen amount: ");
			int yenAmount = input.nextInt(); // enter the yen amount
			
		    moneyAmount = yenAmount; // total coins
			
			
		    System.out.println("Here is the amount of $" + yenAmount + " broken down: ");
			System.out.println("¥10,000  " + moneyConverter(moneyAmount, 10000));
			System.out.println("¥5,000   " + moneyConverter(moneyAmount, 5000));
			System.out.println("¥1,000   " + moneyConverter(moneyAmount, 1000));
			System.out.println("¥500     " + moneyConverter(moneyAmount, 500));
			System.out.println("¥100     " + moneyConverter(moneyAmount, 100));
			System.out.println("¥50      " + moneyConverter(moneyAmount, 50));
			System.out.println("¥10      " + moneyConverter(moneyAmount, 10));
			System.out.println("¥5       " + moneyConverter(moneyAmount, 5));
			System.out.println("¥1       " + moneyConverter(moneyAmount, 1));
			
		
		}
		
		else if (currency == 2) {
			
			System.out.print("Enter a decimal dollar amount: ");
			double dollarAmount = input.nextDouble(); // enter the dollar amount
			moneyAmount = (int)(dollarAmount * 100); // total coins
		
			
			System.out.println("Here is the amount of $" + dollarAmount + " broken down: ");
			System.out.println("Dollars   " + moneyConverter(moneyAmount, 100));
			System.out.println("Quarters  " + moneyConverter(moneyAmount, 25));
			System.out.println("Dimes     " + moneyConverter(moneyAmount, 10));
			System.out.println("Nickels   " + moneyConverter(moneyAmount, 5));
			System.out.println("Pennies   " + moneyConverter(moneyAmount, 1));
		
		
			}
	
		}
		
	
		public static int moneyConverter(int centAmount, int placeholder) { // function to break down change 
		 
			int i = 0;
			int[] moneyArray = new int[10];
			for (i = 0; i < 1; i++) {
				moneyArray[i] = centAmount / placeholder;
			}
		 
		UpdatedMonetaryUnits.moneyAmount %= placeholder; // access the global variable -- update it within the function
	 	return moneyArray[0];
		 
		 } // end function
		
	}
	
	
