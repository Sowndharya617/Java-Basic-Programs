import java.util.Scanner;
class gcd{
    public static void main(String [] args) {
        Scanner sow = new Scanner(System.in);
        int n=sow.nextInt();
        int m = sow.nextInt();
        int gcd =1;
        for(int i=1;i<=n;i++){
        int fac=n%i;
        if(fac==0 ){
                System.out.println("Factors of num1 :"+i);}
        }
        for (int j=1;j<=m;j++){
        int fact=m%j;
            if(fact==0 ){
                System.out.println("Factorsof num2 "+j);
                if(n%j==0){
                     gcd=j;}
            } 
        }
         System.out.println("Greatest common divisor  :"+ gcd);
    }
}
