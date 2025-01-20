import java.util.Scanner;

public class divisible_sum_digit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num=sc.nextInt();
        int orgnum=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum of digit= "+sum);
        if(orgnum % sum == 0){
            System.out.println("The Number is divisible by its sum of digit!");
        }else{
            System.out.println("The Number is not divisible by its sum of digit!");
        }
        sc.close();
    }
    
}
