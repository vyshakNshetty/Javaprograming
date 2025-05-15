import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the ReverseNo:");
        Scanner vy=new Scanner(System.in);
        int n=vy.nextInt();
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }

    }
}
