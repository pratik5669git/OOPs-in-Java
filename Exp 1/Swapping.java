public class Swapping {
    public static void main(String[] args) {
        int a=4,b=1;
        
        // With third variable..
        System.out.println("Before swapping:"+a+","+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+","+b);

        // Without third variable..
        System.out.println("Before swapping:"+a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping:"+a+","+b);
    }
}
