import java.util.Random;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = generateRandomArray(100000);
    long startTime = System.currentTimeMillis();
    bubbleSort(array);
    long endTime = System.currentTimeMillis();
    System.out.println("Bubble Sort Time: " + (endTime - startTime) + "ms");
  }

  public static int[] generateRandomArray(int size) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(1000000);
    }
    return array;
  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}