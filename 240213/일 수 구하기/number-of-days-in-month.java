import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month == 2) {
            System.out.print(28);
        } else {
            if (month >= 8) {
                if (month % 2 == 0) {
                    System.out.print(31);
                } else {
                    System.out.print(30);
                }
            } else {
                if (month % 2 == 0) {
                    System.out.print(30);
                } else {
                    System.out.print(31);
                }
            }
        }
    }
}