import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int result = i;

            if (i % 3 == 0) {
                result = 0;
            } else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                result = 0;
            } else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                result = 0;
            }
            System.out.print(result + " ");
        }
    }
}