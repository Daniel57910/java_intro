import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name");
    String username = scanner.next();
    System.out.println(username);

    int isOdd = 0;

    while (isOdd != 17) {
      System.out.println("Enter an int");
      isOdd = scanner.nextInt();
      System.out.println(oddNumber(isOdd));
    }
  }

  public static boolean oddNumber(int num) {
    return num % 2 == 0 ? false : true;
  }

}