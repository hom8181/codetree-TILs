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

        if (checkCold(aYn, aTemp)) {
            coldCount++;
        }
        if (checkCold(bYn, bTemp)) {
            coldCount++;
        }
        if (checkCold(cYn, cTemp)) {
            coldCount++;
        }

        if (coldCount >= 2) {
            System.out.print("E");
        }
    }

    public static boolean checkCold(String cold, int temp) {
        return cold.equals("Y") && temp >= 37;
    }
}