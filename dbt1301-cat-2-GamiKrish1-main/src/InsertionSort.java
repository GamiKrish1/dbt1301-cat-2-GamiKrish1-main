import java.util.Random;

public class InsertionSort {
  public static void main(String[] args) {
    int[] array = generateRandomArray(100000);
    long startTime = System.currentTimeMillis();
    insertionSort(array);
    long endTime = System.currentTimeMillis();
    System.out.println("Insertion Sort Time: " + (endTime - startTime) + "ms");
  }

  public static int[] generateRandomArray(int size) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(1000000);
    }
    return array;
  }

  public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
    }
  }
}