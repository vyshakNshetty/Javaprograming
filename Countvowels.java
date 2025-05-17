import java.util.Scanner;

public class Countvowels {
    public static void main(String[] args) {
        System.out.println("Enter the countVowels");
        Scanner vy=new Scanner(System.in);
        String text=vy.nextLine();
        int b=0;
        for (int i=1;i<text.length();i++){
            if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'){
                b++;
            }

        }
        System.out.println(b);
    }
}
