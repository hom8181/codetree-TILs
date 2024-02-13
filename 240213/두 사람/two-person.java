import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ageA = scanner.nextInt();
        String  sexA = scanner.next();

        int ageB = scanner.nextInt();
        String  sexB = scanner.next();

        if ((sexA.equals("M") && ageA >= 19) || (sexB.equals("M") && ageB >= 19)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}