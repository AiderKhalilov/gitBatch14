public class MethodWhichNumLarger {
    public static int num(int a, int b){
        if (a>b){
            System.out.println(a);
        } else if (a<b){
            System.out.println(b);
        } else {
            System.out.println("The values are equal");
        }
        return a;
    }

    public static void main(String[] args) {
        num(7,9);
    }
}
