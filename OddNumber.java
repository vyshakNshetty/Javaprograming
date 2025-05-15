import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner vy=new Scanner(System.in);
        int n=vy.nextInt();
        for (int i=1;i<=n;i=i+2){
            System.out.println("Odd Number-:"+i);
        }
    }
}
