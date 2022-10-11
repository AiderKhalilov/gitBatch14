import java.util.Scanner;

public class ReverseStrWithLoop {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String reversedStr = "";
        char x;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i);
            reversedStr = x + reversedStr;
        }
        System.out.println(reversedStr);
    }
}
