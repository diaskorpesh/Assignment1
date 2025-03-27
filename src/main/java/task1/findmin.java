import java.util.Scanner;
public class findmin {
    // Complexity: linear - O(n)
    public static int minf(int i, int[] arr) {
        if (i == arr.length-1) {
            return arr[i];
        }
        int min = minf(i + 1, arr);
        if (min < arr[i]) {
            return min;
        }else
        {
            return arr[i];

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(minf(0,numbers));

        scanner.close();
    }
}