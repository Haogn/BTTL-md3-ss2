package ra.bt4;

public class bt4 {
    public static void main(String[] args) {
        // tìm ra 20 số nguyên tố đầu tiên
        int count = 0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên ");
        while (count < 20) {
            if (!check(number)) {
                System.out.print( " " + number);
                count++ ;
            }
            number++ ;

        }
    }

    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
