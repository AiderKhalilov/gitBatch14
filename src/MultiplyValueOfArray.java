public class MultiplyValueOfArray {
    public static void main(String[] args) {

        double[][] num = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        for (int i = 0; i < num.length; i++) {

            for (int x = 0; x < num[i].length; x++) {
                System.out.print(num[i][x] * 2 + " ");
            }
            System.out.println();

            //Double and print array


        }

    }}
