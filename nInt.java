import java.util.Scanner;
// Print numbers from 1 to n using while loop
public class nInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
