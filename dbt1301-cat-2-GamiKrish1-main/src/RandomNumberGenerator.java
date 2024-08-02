import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumberGenerator {
    private int[] numbers;

    public RandomNumberGenerator(int size) {
        // Initialize array and call generateNumbers
        numbers = new int[size];
        generateNumbers();
        saveNumbersToFile("random_numbers.txt");
    }

    private void generateNumbers() {
        // Generate random numbers and store in the array
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }
    }

    private void saveNumbersToFile(String filename) {
        // Save numbers to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int number : numbers) {
                writer.println(number);
            }
        } catch (IOException e) {
            System.err.println("Error saving numbers to file: " + e.getMessage());
        }
    }

    public int[] getNumbers() {
        // edit here to have what you need returned
        return numbers;
    }

    public static void main(String[] args) {
        new RandomNumberGenerator(100000);
    }
}
