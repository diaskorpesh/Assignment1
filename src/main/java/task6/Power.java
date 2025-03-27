import java.util.Scanner;

public class Power {
    public static int Nsum(int i,int a,int b) {
        // Complexity: linear - O(n)
        if(i==b){
            return a;
        }else{
            return a*Nsum(i+1,a,b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int v = scanner.nextInt();
        System.out.println(Nsum(1,n,v));


        scanner.close();
    }
}