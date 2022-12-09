import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        // Print sum of n natural numbers
        // if n = 5, sum = 1+2+3+4+5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
        }
        System.out.println(sum);

    }
}
