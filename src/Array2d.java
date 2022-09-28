public class Array2d {
    public static void main(String[] args) {
        /**/
        double[][] num = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6},
                {2.2,3.4},
        };
        for(int r=0; r<num.length; r++){
            for(int c=0; c<num.length; c++){
                System.out.print(num[r][c]+" ");
            }
            System.out.println();
        }


    }
}
