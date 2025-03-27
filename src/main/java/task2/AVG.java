import java.util.Scanner;
public class AVG {
    // Complexity: linear - O(n)
    public static int AVG(int i, int sum, int[] arr) {
        if (i < arr.length) {
            return AVG(i + 1, sum + arr[i], arr);
        } else {
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(AVG(0, 0, numbers)/(double)n);
        scanner.close();
    }
}