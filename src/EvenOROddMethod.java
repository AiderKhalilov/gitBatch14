public class EvenOROddMethod {
    public static int num(int a){
        if (a%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        return a;}

    public static void main(String[] args) {
      num(7);
    }
}
