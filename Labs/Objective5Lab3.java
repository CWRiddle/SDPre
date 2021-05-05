import java.util.Scanner;

public class Objective5Lab3{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int userNum;
    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    System.out.print("The number is ");

    if(userNum > 0)
      System.out.println("positive.");
    else if(userNum < 0)
      System.out.println("negative.");
    else
      System.out.println("a donut.");

    scanner.close();
  }
}
