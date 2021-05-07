public class Objective9Lab4{
  public static void main(String[] args)
  {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    double num1, num2;

    System.out.println("Please give me a number: ");
    num1= kb.nextDouble();
    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
  }

  public static double findAverage(double x, double y)
  {
    return((x + y) / 2);
  }
}
