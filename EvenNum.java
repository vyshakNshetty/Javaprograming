import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        System.out.println("Enter the No:");
        Scanner vy=new Scanner(System.in);
        int n=vy.nextInt();
        for (int i=0;i<=n;i=i+2){
            System.out.println(i);

        }
    }
}
