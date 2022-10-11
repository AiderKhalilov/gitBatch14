import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class InstVariables {

    static void mystery(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num[i] /= 2;
            } else {
                num[i]*= 10;
            }
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] myasteryArrya = {5, 6, 9, 2, 12};
        mystery(myasteryArrya);
    }


}

