public class swap_without_thrd_var {
    public static void main(String args[]){
        int a=4;
        int b=7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
