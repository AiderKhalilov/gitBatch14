public class Array2d {
    public static void main(String[] args) {
        double[][] num = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6},
        };
        for (int i = 0; i < num.length; i++) {

            for (int x = 0; x < num[i].length; x++) {
                System.out.print(num[i][x] + " ");
            }
            System.out.println();
        }
    }
}

