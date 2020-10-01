import java.util.Scanner;
/**
 * program to calculate largest integer
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user to input three integers
  System.out.println("Please enter three integers on separate lines");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();

  if (num1 >= num2) {
    if (num1 >= num3)
      System.out.println("Maximum: " + num1);
    else
      System.out.println("Maximum: " + num3);

  } else {
    if (num2 >= num3)
      System.out.println("Maximum: " + num2);
    else 
      System.out.println("Maximum: " + num3);
  }
  }
}
