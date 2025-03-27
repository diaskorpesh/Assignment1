import java.util.Scanner;
public class factorial {
    // Complexity: linear - O(n)
    public static int check(int i,int sum,int a) {
        if (i<=a) {
            return check(i+1,sum*i,a);
        } else {
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(check(1,1,n));
        scanner.close();
    }
}