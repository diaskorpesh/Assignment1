import java.util.Scanner;

public class Fibonacci {
    // Complexity: exponential - O(2^n)
    public static int Nsum(int a) {
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        return Nsum(a-1)+Nsum(a-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(Nsum(n));


        scanner.close();
    }
}