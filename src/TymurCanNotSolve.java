public class TymurCanNotSolve {

    // First example
   /* static String mixString(String s1, String s2){
        StringBuilder combined = new StringBuilder();
        for (int i=0; i<s1.length(); i++){
            combined.append(s1.charAt(i));
            combined.append(s2.charAt(i));
        }
        return combined.toString();
    }*/
     static String mixString(String s1, String s2) {
        String combined = "";
        String finalResult = "";
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        for (int i = 0; i < s1Arr.length; i++) {
            combined = String.valueOf(s1Arr[i]) + String.valueOf(s2Arr[i]);
            finalResult+=combined;
        }
        return finalResult;
    }

    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
