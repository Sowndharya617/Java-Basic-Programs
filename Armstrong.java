import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number : ");
        int a = input.nextInt();
        int count = 0;
        int arm_value =0;
        
        for(int temp = a;temp!=0;temp = temp/10){
            count++;
        }
        
        for(int i = a; i>0;i= i/10){
            int digit = i%10;
            //System.out.print(digit+" ");
            double value = Math.pow(digit,count);
            int sum = (int) value;
            arm_value +=value;

        }//System.out.println(arm_value);
        if(arm_value == a){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
