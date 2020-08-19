package Quest0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        byte c = 0, k = 0, w = 0;
        String[] results = new String[t];
        for (byte i = 0; i < t; i++) {
            c = scanner.nextByte();
            k = scanner.nextByte();
            w = scanner.nextByte();
            if (k / w >= c) {
                results[i] = "yes";
            } else {
                results[i] = "no";
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
