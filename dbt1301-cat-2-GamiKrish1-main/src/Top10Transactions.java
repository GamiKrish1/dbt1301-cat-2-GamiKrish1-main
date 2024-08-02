import java.util.Arrays;
import java.util.Scanner;

public class Top10Transactions {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of transactions: ");
    int n = scanner.nextInt();
    int[] transactions = new int[n];

    System.out.println("Enter the transaction amounts:");
    for (int i = 0; i < n; i++) {
      System.out.print("Transaction " + (i + 1) + ": ");
      transactions[i] = scanner.nextInt();
    }

    int[] top10 = top10Transactions(transactions);
    System.out.println("Top 10 highest transactions:");
    System.out.println(Arrays.toString(top10));
  }

  public static int[] top10Transactions(int[] transactions) {
    Arrays.sort(transactions);
    int[] top10 = new int[Math.min(10, transactions.length)];
    for (int i = 0; i < top10.length; i++) {
      top10[i] = transactions[transactions.length - 1 - i];
    }
    return top10;
  }
}