import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mathA = scanner.nextInt();
        int englishA = scanner.nextInt();

        int mathB = scanner.nextInt();
        int englishB = scanner.nextInt();

        if (mathA == mathB) {
            if (englishA > englishB) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        } else {
            if (mathA > mathB) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }
    }
}