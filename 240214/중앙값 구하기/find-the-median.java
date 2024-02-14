import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            // a가 최대값
            System.out.print(Math.max(b, c));
        } else if (b > c) {
            // b가 최대값
            System.out.print(Math.max(a, c));
        } else {
            // c가 최대값
            System.out.print(Math.max(a, b));
        }
    }
}