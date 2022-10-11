public class Repl135 {
    static String surround(String s, String searchTerm){
        String a="";
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==searchTerm.charAt(0)){
                a+="("+searchTerm.charAt(0)+")";
            } else{
                a+=s.charAt(i);
            }
        }
        return a;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
