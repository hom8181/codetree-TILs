import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.print("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.print("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.print("Summer");
        } else {
            System.out.print("Winter");
        }
    }
}