import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        System.out.println("Enter the No:");
        Scanner vy=new Scanner(System.in);
        int n=vy.nextInt();
        for (int i=0;i<=n;i=i+2){
            System.out.println("Even No:"+i);

        }
        for (int x=1;x<=n;x=x+2){
            System.out.println("Odd No:"+x);
        }
    }
}
