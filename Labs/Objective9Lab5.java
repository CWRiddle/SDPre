import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.print("Please give me a number: ");
    num1 = kb.nextDouble();
    System.out.print("Please give me another number: ");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
        case 1:
          System.out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
          break;
        case 2:
          System.out.println("The average of" + num1 + " and " + num2 + " is: " + findAverage(num1, num2));
          break;
        case 3:
          System.out.println("The amount in tax to be collected from a purchse of " + num1 + " and " + num2 + " is: " + calcTax(num1, num2));
          break;
        case 4:
          break;
        default:
          break;

		}

    if(choice == 4)
    {
      System.out.println("You have chosen to quit");
      break;
    }

    if(choice < 1 || choice > 4){
      System.out.println("Invalid entry. Please try again.");
    }
	}
  kb.close();
}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}

  public static double findAverage(double num1, double num2){
    double average = (num1 + num2) / 2;
    return average;
  }

  public static double calcTax(double num1, double num2){
    double tax = (num2 + num1) * 0.0831;
    return tax;
  }
}
