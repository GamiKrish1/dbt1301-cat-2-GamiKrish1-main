import java.util.Random;

public class QuickSort {
  public static void main(String[] args) {
    int[] array = generateRandomArray(100000);
    long startTime = System.currentTimeMillis();
    quickSort(array, 0, array.length - 1);
    long endTime = System.currentTimeMillis();
    System.out.println("Quick Sort Time: " + (endTime - startTime) + "ms");
  }

  public static int[] generateRandomArray(int size) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(1000000);
    }
    return array;
  }

  public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(array, low, high);
      quickSort(array, low, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, high);
    }
  }

  public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i;
    int j = low - 1;
    for (i = low; i <= high - 1; i++) {
      if (array[i] < pivot) {
        j++;
        swap(array, i, j);
      }
    }
    swap(array, i, j + 1);
    return j + 1;
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}