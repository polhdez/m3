package m3;
import java.util.Scanner;

class Nivell1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        // Fibonacci
        int prev = 0;
        int sum = 1;
        for(int i = 0; i <= n; i++) {
            sum = prev + sum;
            prev = sum;
            System.out.println(sum);
        }
    }
}