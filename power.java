
import java.util.Scanner;
class power{
    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        double a = sow.nextInt();
        double b = sow.nextInt();
        double c = Math.pow(a, b);
        System.out.println(c);
    }
}