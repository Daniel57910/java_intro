public class JavaBuzz {
  public static void main(String[] args) {
    int fizzBuzz = 1;
    for (fizzBuzz = 1; fizzBuzz <= 100; fizzBuzz++) {
      playFizzBuzz(fizzBuzz);
    }

  }

  public static void playFizzBuzz(int fizzBuzz) {
    if (fizzBuzz % 15 == 0) {
      System.out.println("JAVABUZZ");
    }
    else if (fizzBuzz % 5 == 0) {
      System.out.println("BUZZ");
    }
    else if (fizzBuzz % 3 == 0) {
      System.out.println("FIZZ");
    }
    else {
      System.out.println(fizzBuzz);
    }
  }
}