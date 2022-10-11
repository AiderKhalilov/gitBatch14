public class StringManip3 {
    static void checkEnds(String name, String checking) {
        boolean ends = false;
        if (name.endsWith(checking)) {
            System.out.println(!ends);
        }else{
            System.out.println(ends);
        }
    }
        public static void main (String[] args){
            //starts the code from here
            String s1 = "hello how are you";
            checkEnds(s1,"u");
            checkEnds(s1,"world");
            checkEnds(s1,"are");
            checkEnds(s1,"you");
        }
}
