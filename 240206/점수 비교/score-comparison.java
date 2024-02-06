import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mathA = scanner.nextInt();
        int englishA = scanner.nextInt();

        int mathB = scanner.nextInt();
        int englishB = scanner.nextInt();

        if (mathA > mathB && englishA > englishB) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

}