public class First {

    public static void main(String[] args) {
        for (int r = 7; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
                if (r == 1 && c == 1) {
                    System.out.println();
                    for (int x = 2; x <= 7; x++) {
                        for (int y = 1; y <= x; y++) {
                            System.out.print(y + " ");
                        }
                        System.out.println();
                    }
                }

            }
            System.out.println();
        }

    }
}
