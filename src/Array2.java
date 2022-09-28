import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        int [] x = new int[5];
        int o=0;
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<x.length; i++){
            o=scan.nextInt();
            x[i]= o;

        }
        for (int i=0; i<= x.length-1; i++){
            System.out.println(x[i]*10);
        }

    }
}
