import java.util.Scanner;
class factors{
    public static void main(String [] args) {
        Scanner sow = new Scanner(System.in);
        int m = sow.nextInt();

            for(int j = 1;j<=m;j++){
            int fac=m%j;
            if(fac==0){
            System.out.println("Factors/divisors :"+j);
            }
            
              
        } 
    }
}

