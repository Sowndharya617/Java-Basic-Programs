import java.util.Scanner;
public class prime {
    public static void main(String[]args){
      Scanner sow = new Scanner(System.in);
        int a =sow.nextInt();
        int value =0;
        for(int i =1;i<a;i++){
            if(a%i==0){
            //System.out.println(i);
            value = i;
            }
        }
        if(value ==1){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
