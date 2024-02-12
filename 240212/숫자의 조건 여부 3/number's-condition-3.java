import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 13 == 0 || a % 19 == 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}