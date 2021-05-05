public class Objective7Lab3{
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20){
      System.out.print(counter);

      if(counter % 2 == 0)
        System.out.println(" is even");
      else
        System.out.println(" is odd ");

      counter++;
    }
  }
}
