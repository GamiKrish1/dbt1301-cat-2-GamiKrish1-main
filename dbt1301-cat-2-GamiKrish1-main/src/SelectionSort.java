import java.util.Random;

public class SelectionSort {
  public static void main(String[] args) {
    int[] array = generateRandomArray(100000);
    long startTime = System.currentTimeMillis();
    selectionSort(array);
    long endTime = System.currentTimeMillis();
    System.out.println("Selection Sort Time: " + (endTime - startTime) + "ms");
  }

  public static int[] generateRandomArray(int size) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(1000000);
    }
    return array;
  }

  public static void selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      int temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
  }
}
