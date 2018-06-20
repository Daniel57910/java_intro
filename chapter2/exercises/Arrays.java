public class Arrays {
  public static void main(String[] args) {
    //dynamic memory allocation for array of strings
    String[] stringArray = {"dogs", "cats", "rabbits", "chickens"};

    int[] intArray = {100, 200, 300, 400, 500, 600};

    // static memory allocation for array of integers
    int[]test = new int[10];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] *= 2;
    }

    for (int i = 0; i < test.length; i++) {
      test[i] = i * 2;
      System.out.println(test[i]);
    }

    for (int i  = 0; i < stringArray.length; i++) {
      System.out.println("Animal = " + stringArray[i]);
    }

    for (int i = 0; i < intArray.length; i++) {
      System.out.println("Integer doubled  = " + intArray[i]);
    }
    
  }


}
// declare an array of Strings and print it

// declare an array of integers and print it

// declare an ArrayList of integers, add numbers to it, and then print it
