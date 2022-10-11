public class StringManip2 {
    //Create a String named s1 = "hello"  check weather string is empty or not
    //
    //Create a String named s2 = ""  check weather string is empty or not
    public static void checkEmptyString(String stringVariableName) {
        boolean isEmpty = false;
        if (!stringVariableName.isEmpty()) {
            System.out.println(isEmpty);
        } else {
            System.out.println(!isEmpty);
        }
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "";

        checkEmptyString(s1);
        checkEmptyString(s2);
    }
}
