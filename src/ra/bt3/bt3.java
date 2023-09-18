package ra.bt3;

public class bt3 {
    public static void main(String[] args) {
        // tìm ra số nguyên tố từ 2 đến 100
        System.out.println("Dãy các số nguyên tố từ 2 đến 100");
        int number = 2 ;
        while (number <=100) {
            if (!check(number)) {
                System.out.print(number + " ");
            }
            number++;
        }

    }

    public static boolean check(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return false ;
        }

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number%i==0) {
                return true ;
            }
        }
        return false;
    }
}


