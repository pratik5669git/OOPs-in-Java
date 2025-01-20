import java.util.Scanner;

public class simpleinterest {
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter principal:");
    double p=sc.nextDouble();
    System.out.print("Enter rate:");
    double r=sc.nextDouble();
    System.out.print("Enter time:");
    double t=sc.nextDouble();

    double si=(p*r*t)/100;
    System.out.println("Accured Interest="+si);
    double amt=si+p;
    System.out.println("Final Amount="+amt);

    sc.close();
    }
}

