import java.util.Scanner;

public class string {
    // Complexity: linear - O(n)
    public static boolean isAllDigitsRecursive(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isAllDigitsRecursive(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (isAllDigitsRecursive(input, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

