import java.util.Scanner;
// Complexity: constant - O(1)
public class checking {
    public static String check(int a) {
        if (a%2==0) {
            return "Composite";
        } else {
            return "Prime";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(check(n));
        scanner.close();
    }
}