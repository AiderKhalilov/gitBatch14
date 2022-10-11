public class Recursion {
    public static void main(String[] args) {
       count(14);
    }
    public static void count(int i){
        if(i==0){
            System.out.println("Done!");
        }else{
            System.out.println(i);
            i--;
            count(i);
        }
    }
}
