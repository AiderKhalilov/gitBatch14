import java.util.Scanner;

public class TheFirstLettersOfTheWord {
    public static void main(String[] args) {
        /*Using Scanner class input string value.
        Print out the following: "The first 3 letters of \_\_\_ is ___"
        For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".*/
        Scanner scan=new Scanner(System.in);

        String inputWord=scan.nextLine();
        System.out.println("The first 3 letters of "+inputWord+" is "+inputWord.substring(0,3));



    }
}
