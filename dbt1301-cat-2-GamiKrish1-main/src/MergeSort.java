import java.util.Random;

public class MergeSort {
  public static void main(String[] args) {
    int[] array = generateRandomArray(100000);
    long startTime = System.currentTimeMillis();
    mergeSort(array, 0, array.length - 1);
    long endTime = System.currentTimeMillis();
    System.out.println("Merge Sort Time: " + (endTime - startTime) + "ms");
  }

  public static int[] generateRandomArray(int size) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(1000000);
    }
    return array;
  }

  public static void mergeSort(int[] array, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      mergeSort(array, low, mid);
      mergeSort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
  }

  public static void merge(int[] array, int low, int mid, int high) {
    int[] left = new int[mid - low + 1];
    int[] right = new int[high - mid];
    System.arraycopy(array, low, left, 0, mid - low + 1);
    System.arraycopy(array, mid + 1, right, 0, high - mid);
    int i = 0, j = 0, k = low;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        array[k] = left[i];
        i++;
      } else {
        array[k] = right[j];
        j++;
      }
      k++;
    }
    while (i < left.length) {
      array[k] = left[i];
      i++;
      k++;
    }
    while (j < right.length) {
      array[k] = right[j];
      j++;
      k++;
    }
  }
}