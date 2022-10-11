import java.util.Scanner;

public class Palinfrome2 {
    public static void main(String[] args) {
        /*Write code that will take in a String input and check to see if it is a palindrome or not.
        A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
        Examples of palindromes:
        - racecar
                - was it a car or a cat I saw
        - never odd or even
                - rats live on no evil star
        Your check should be case insensitive too.  For example, "Bob" is a palindrome,
         despite the first B being capitalized.
                Your program will print out "true" if it's a palindrome and "false" if not.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your word");
        String input=scan.nextLine();
        StringBuilder test=new StringBuilder(input);
        boolean itIsPalindrome=true;
        if(input.equalsIgnoreCase(String.valueOf(test.reverse()))){
            System.out.println(itIsPalindrome);
        }else {
            System.out.println(!itIsPalindrome);
        }


    }
}
