import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Num:");
        Scanner vy =new Scanner(System.in);
        int n=vy.nextInt();
        for(int i=2;i<=n;i++){
            int a=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    a++;
                }
            }
            if (a==2){
                System.out.println("It is prime :"+i);
            }
        }
    }
}
