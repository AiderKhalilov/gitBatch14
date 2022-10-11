public class PalindromMethod {
    public static String word(String palindrome){
        StringBuilder a= new StringBuilder(new StringBuilder(palindrome).reverse().toString());
        String reverse= String.valueOf(a);
        if(reverse.equalsIgnoreCase(palindrome)){
            System.out.println("Word is palindrome");
        }else{
            System.out.println("Word is not palindrome");
        }
        return palindrome;
        }

    public static void main(String[] args) {
          word("Bob");
    }
}
