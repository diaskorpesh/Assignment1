import java.util.Scanner;

public class bincof {

    public static int bin(int n, int k) {
        // Complexity: exponential - O(2^n)
        if (k == 0 || k == n) {
            return 1;
        }
        return bin(n - 1, k - 1) + bin(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(bin(n, k));

        scanner.close();
    }
}

