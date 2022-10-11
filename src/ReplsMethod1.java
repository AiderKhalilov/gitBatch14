public class ReplsMethod1 {
    public static String censorLetter(String s, char x) {
        String changeToStar="";
        for (int i =0; i<s.length(); i++){
            if(s.charAt(i)==x){
               changeToStar= s.replace(s.charAt(i),'*');
            }
        }
        return changeToStar;
    }
    public static void main(String[] args) {
        String spaceOut = censorLetter("computer science", 'e');
        System.out.println(spaceOut);
    }
}
