import java.util.Scanner;
public class Fibonacci_Series {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(first+ " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
