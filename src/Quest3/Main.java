package Quest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] exit = new String[t];

        for (int i = 0; i < t; i++) {
            byte n = scanner.nextByte();
            String number = scanner.next();
            String[] digits = number.split("(?<=.)");
            List<Character> chars = new ArrayList<>();
            for (int j = 0; j < 4 * n; j += 4) {
                int numberAscii = Integer.parseInt(digits[j]) * 10 + Integer.parseInt(digits[j + 2]) +
                        Integer.parseInt(digits[j + 1]) * 10 + Integer.parseInt(digits[j + 3]);
                chars.add((char) numberAscii);
            }
            exit[i] = chars.stream().map(String::valueOf).collect(Collectors.joining());
        }

        for (String text : exit) {
            System.out.println(text);
        }

    }
}
