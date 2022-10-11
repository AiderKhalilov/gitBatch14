public class reduce10From2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
    }
    //create method reduce10 here
    static int reduce10(int[][] newArray) {
        int reduced=0;
        for (int i = 0; i < newArray.length; i++) {
            for (int x = 0; x < newArray[i].length; x++) {
                reduced = newArray[i][x] - 10;
                System.out.print(reduced+" ");
            }System.out.println();
        }
        return reduced;
    }
}
