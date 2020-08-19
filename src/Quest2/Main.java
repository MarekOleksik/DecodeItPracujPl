package Quest2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] numbers = new int[t];
        int[] results = new int[t];
        List<Integer> partOfNumbers = new ArrayList<>();
        int counter = 0;
        int number = 0;

        for (int i = 0; i < t; i++) {
            numbers[i] = scanner.nextInt();
            number = numbers[i];

            while (number != 6174) {
                int firstNumber = number / 1000;
                partOfNumbers.add(firstNumber);
                int secondNumber = (number % 1000) / 100;
                partOfNumbers.add(secondNumber);
                int thirdNumber = (number % 100) / 10;
                partOfNumbers.add(thirdNumber);
                int fourthNumber = number % 10;
                partOfNumbers.add(fourthNumber);

                Collections.sort(partOfNumbers);

                number = partOfNumbers.get(3) * 1000 + partOfNumbers.get(2) * 100 + partOfNumbers.get(1) * 10 +
                        partOfNumbers.get(0) - (partOfNumbers.get(0) * 1000 + partOfNumbers.get(1) * 100 + partOfNumbers.get(2) * 10 +
                        partOfNumbers.get(3));
                counter++;
                partOfNumbers.clear();
                if (counter > 100) {
                    counter = -1;
                    break;
                }
            }
            results[i] = counter;
            counter = 0;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
