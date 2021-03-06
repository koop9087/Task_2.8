import java.util.Scanner;

public class CustomScanner {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int scanInt () {
        int a = SCANNER.nextInt();
        return a;
    }
}
