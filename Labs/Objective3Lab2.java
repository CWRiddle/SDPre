public class Objective3Lab2 {
  public static void main(String args[]) {
    double side1, side2, side3;
    side1 = 10.0;
    side2 = 8.0;
    side3 = Math.sqrt((side1 * side1) + (side2 * side2));
    double hypotenuse = side3;

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
