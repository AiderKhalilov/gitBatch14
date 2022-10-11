import java.util.Scanner;

public class First3Char {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] input=new String[5];
        for(int i=0; i< input.length; i++){
            input[i]=scan.nextLine();
        }
        for(int i=0; i<input.length; i++){
            System.out.println(input[i].substring(0,3));
        }
    }
}
