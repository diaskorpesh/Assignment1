public class Permutations {

    public static void generatePermutations(String str, String chosen) {
        if (str.length() == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, chosen + c);
            }
        }
    }

    public static void main(String[] args) {
        String input = "IOX";
        generatePermutations(input, "");
    }
}
