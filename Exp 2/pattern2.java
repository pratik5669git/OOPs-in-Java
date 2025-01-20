public class pattern2{
    public static void main(String args[]){
    for(int i=1;i<=8;i++){
        if(i%2==0){
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
        }
        else{
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
