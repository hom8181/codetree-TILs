import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 10 && a <= 20) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}