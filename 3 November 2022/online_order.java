
import java.util.Scanner;

public class online_order {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of years: ");
        int n = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = in.nextInt();
        System.out.print("Enter the principal: ");
        int p = in.nextInt();
        int si = (p * n * r) / 100;
        System.out.println("Simple Interest is: " + si);
        in.close();
    }
}