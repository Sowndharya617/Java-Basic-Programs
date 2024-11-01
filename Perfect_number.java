
import java.util.Scanner;

class perfect_no {

    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        System.out.print("NUMBER: ");
        int a = sow.nextInt();
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }

        }
        System.out.println("The sum value : " + sum);

        if (sum == a) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfecct number");
        }

    }

}
