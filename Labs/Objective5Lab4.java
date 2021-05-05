import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String args[]){
    int num;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    num = input.nextInt();
    System.out.print("The number is ");
    if(num % 2 == 0)
      System.out.println("even.");
    else
      System.out.println("odd.");
  }
}
