package echop;
import java.util.Scanner;

public class Echo {

    public static void Echo()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input?");
        String output = scan.nextLine();
        System.out.println(output);
    }
}
