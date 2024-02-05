import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        print(a > b ? 1 : 0);
        print(a > c ? 1 : 0);
        print(a > d ? 1 : 0);
        print(a > e ? 1 : 0);
    }

    private static void print(int num) {
        System.out.println(num);
    }
}