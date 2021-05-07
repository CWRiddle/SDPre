public class Objective9Lab3{
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection =0;

    while(true){
      printMenu();

      selection = scanner.nextInt();

      switch(selection){
        case 1:
          System.out.println("Hello");
          break;
        case 2:
          System.out.println("Apples, Bananas, Cocounuts");
          break;
        default:
          break;
      }
      if(selection == 3)
      {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }

  public static void printMenu(){
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

}
