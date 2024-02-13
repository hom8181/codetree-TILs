import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sex = scanner.nextInt();
        int age = scanner.nextInt();
        
        if (sex == 0) {
            if (age >= 19) {
                System.out.print("MAN");
            } else {
                System.out.print("BOY");
            }
        } else {
            if (age >= 19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}