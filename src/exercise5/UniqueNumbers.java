package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        int i = 0;
        int j = 0;
        for (i = 0; i < numbers.length; i++) {
          for (j = 0; j < numbers.length; j++) {
            if (uniqueNumbers[j] == 0) {
              uniqueNumbers[j] = numbers[i];
              break;
            }
            if (uniqueNumbers [j] == numbers[i]) {
              break;
            }
            }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}

}