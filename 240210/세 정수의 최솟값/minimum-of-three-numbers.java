import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int ab = Math.min(a, b);
        int min = Math.min(ab, c);

        System.out.print(min);

    }
}