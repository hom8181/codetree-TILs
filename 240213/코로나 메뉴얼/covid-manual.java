import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String aYn = sc.next();
        int aTemp = sc.nextInt();

        String bYn = sc.next();
        int bTemp = sc.nextInt();

        String cYn = sc.next();
        int cTemp = sc.nextInt();

        int coldCount = 0;
        coldCount = coldCount + checkCold(aYn, aTemp);
        coldCount = coldCount + checkCold(bYn, bTemp);
        coldCount = coldCount + checkCold(cYn, cTemp);

        if (coldCount >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }
    }

    public static int checkCold(String cold, int temp) {
        if (cold.equals("Y") && temp >= 37) {
            return 1;
        } else {
            return 0;
        }
    }
}