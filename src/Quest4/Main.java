package Quest4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> connections = new HashMap<>();
        String operationType = scanner.next();
        while (!operationType.isBlank()) {
            String numberIp1 = scanner.next();
            String numberIp2 = scanner.next();
            if ("B".equals(operationType)) {
                connections.put(numberIp1, numberIp2);
            } else if ("T".equals(operationType)) {
                if (connections.get(numberIp1).equals(numberIp2)) {
                    System.out.println("T");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("Invalid operation type");
            }
            operationType = scanner.next();
        }
    }
}
