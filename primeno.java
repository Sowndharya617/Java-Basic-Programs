import java.util.Scanner;
class primeno{
    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        int num = sow.nextInt();
        if(num==2){
            System.out.println("Prime");
        }
        else if (num%2==0 || num == 1||num%3==0||num%5==0||num%7==0) {
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }

}