import java.util.Scanner;

public class even_oddsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                evensum=evensum+digit;
            }
            else{
                oddsum=oddsum+digit;
            }
            num/=10;
        }
        System.out.println("EvenSum="+evensum);
        System.out.println("OddSum="+oddsum);
        sc.close();
    }
}