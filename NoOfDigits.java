//a=1233
//for(a.length)


import java.util.Scanner;

class NoOfDigits{
    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        int a = sow.nextInt();
        String b = Integer.toString(a);
        int digits=b.length();
        System.out.println("No of digits :"+digits);
    }
}