import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int resultNum;

        resultNum = a >= b ? 1 : 0;
        print(resultNum);

        resultNum = a > b ? 1 : 0;
        print(resultNum);

        resultNum = b >= a ? 1 : 0;
        print(resultNum);

        resultNum = b > a ? 1 : 0;
        print(resultNum);

        resultNum = a == b ? 1 : 0;
        print(resultNum);

        resultNum = a != b ? 1 : 0;
        print(resultNum);
    }

    private static void print(int num) {
        System.out.println(num);
    }
}