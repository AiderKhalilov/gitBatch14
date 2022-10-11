public class HighestInArray {
    public static void main(String[] args) {
        int[] num={4,12,9,90,2,32};
        int bigest=0;
        for (int num1:num){
            if (num1>bigest){
                bigest=num1;
            }
        }
        System.out.print(bigest);
    }
}
