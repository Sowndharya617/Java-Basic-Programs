import java.util.Scanner;
class reverseno{
    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        long a = sow.nextInt();
        String b = Long.toString(a);
        //System.out.println(b);

        StringBuilder sha = new StringBuilder(b);

        sha.reverse();
        System.out.println(sha);
 
    }
}