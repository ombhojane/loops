import java.util.*;;
public class keep_except {
    public static void main(String[] args) {
        //Dispaly all numbers except multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(" Enter your no");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("Number was " + n);
        } while (true);
    }
}
