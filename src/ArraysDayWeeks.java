import java.util.Arrays;
import java.util.Scanner;

public class ArraysDayWeeks {
    public static void main(String[] args){
        String [] days=new String [7];
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter days of the week starting from Sunday");
        String a=null;

        for(int i=0; i<days.length; i++) {
            System.out.println("Please enter day " + (i+1)+ " of the week");
            days[i]  = scan.nextLine();

        }
         for(int i=0; i<days.length; i++){
             System.out.println(days[i]);
         }
        }
    }

