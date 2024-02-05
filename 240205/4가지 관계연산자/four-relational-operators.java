import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        print(a >= b ? 1 : 0);
        print(a > b ? 1 : 0);
        print(b >= a ? 1 : 0);
        print(b > a ? 1 : 0);
    }

    private static void print(int num) {
        System.out.println(num);
    }
}