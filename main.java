import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Press enter to roll, or type anything else to exit");
    String input;
    while(true) {
      input = scanner.nextLine();
      if(input.equals("")) {
        System.out.println(roll());
      } else {
        System.out.println("Loop broken");
        scanner.close();
        break;
      }
    }
  }
  public static double roll() {
    while(true) {
      double temp = Math.random();
      if (temp != 0) { //Prevents arithmetic
        return (1 / temp);
      }
    }
  }
}
