package Quest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte r = scanner.nextByte();
        byte s = scanner.nextByte();
        int result = 1;
        int maxNumbers = Integer.MIN_VALUE;
        for (byte i = 0; i < r; i++) {
            result = 2 * (i + 1) * 2 * (s - i + 1);
        }
        if (result > maxNumbers) {
            maxNumbers = result;
        }
        System.out.println(maxNumbers);
    }
}

