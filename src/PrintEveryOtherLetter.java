import java.util.Scanner;

public class PrintEveryOtherLetter {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        char[] arr = word.toCharArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                continue;
            } else if (arr[i]==' ') {
                continue;
            }
            System.out.print(arr[i]);


            /*char arr;
            for(int i=0; i<word.length(); i++){
                if (i%2!=0){
                    continue;
                    arr=word.charAt(i);
                } else if (arr=word.charAt(i)==' '){}

                System.out.print(arr);
            }*/


        }
    }
}