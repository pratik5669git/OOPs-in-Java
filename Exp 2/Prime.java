import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter lower limit X:");
        int x=sc.nextInt();
        System.out.print("Enter upper limit Y:");
        int y=sc.nextInt();
        System.out.print("Enter Number of Primes(N):");
        int n=sc.nextInt();

        int count=0;
        System.out.println(("Prime numbers between numbers are:"));

        for(int i=x;i<=y;i++){
            if(i<2)continue;

            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i + " ");
                count++;
                if(count==n)break;
            }
        }
            if(count<n){
                System.out.println("fewer number in range");
            }
        
            sc.close();

        }
    }
    
