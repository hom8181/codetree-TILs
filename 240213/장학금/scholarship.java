import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= 90) {
            if (b >= 95) {
                System.out.print(10);
            } else if (b >= 90) {
                System.out.print(5);
            } else {
                System.out.print(0);
            }
        } else {
            System.out.print(0);
        }
    }
}