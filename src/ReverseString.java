public class ReverseString {

    public static String reverseString(String str, int index) {
        if (index == 0) {
            return str.charAt(0) + "";
        }
        return str;

    }
    public static void main(String[] args) {

        String str = "JavaRush forever";
        System.out.println(reverseString(str, str.length()-1));


    }

}
