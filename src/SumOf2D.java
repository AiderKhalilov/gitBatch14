public class SumOf2D {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int amount = 0;
        int total = 0;
        for (int raw0 = 0; raw0 < a.length; raw0++) {
            for (int col = 0; col < a[raw0].length; col++) {
                amount = a[raw0][col];
                int indexAmount = amount;
                total = indexAmount + total;
            }
        }
        System.out.println(total);
    }
}
