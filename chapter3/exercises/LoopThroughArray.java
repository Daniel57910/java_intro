public class LoopThroughArray {
  public static void main(String[] args) {
    int[]intArray = new int[10];
    makeArr(intArray);
    printArr(intArray);
  }

  public static void makeArr(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 1;
    }
  }

  public static void printArr(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }

}

