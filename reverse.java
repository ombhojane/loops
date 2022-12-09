import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        //Print reverse of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit + "");
            n /= 10;
        }
    }
}
