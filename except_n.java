import java.util.Scanner;

public class except_n {
    public static void main(String[] args) {
        //Dispaly all numbers except multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(" Enter your no");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was " + n);
        } while (true);
    }
}
