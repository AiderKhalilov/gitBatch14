public class Arrays2DEvenIndex {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int size=0;

        for (int raw0 = 0; raw0 < a.length; raw0++) {
            for (int col = 0; col < a[raw0].length; col++) {
                if(col%2==0 && raw0%2==0) {
                    size+=a[raw0][col];
                }
            }
        }System.out.println(size);
    }
}