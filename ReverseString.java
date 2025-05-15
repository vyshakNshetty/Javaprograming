import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the ReverseText :");
        Scanner vy=new Scanner(System.in);
        String text=vy.nextLine();
        String reverse="";
        for (int i=text.length()-1;i>=0;i--){
            reverse += text.charAt(i);
        }
        System.out.println(reverse);
    }
}
