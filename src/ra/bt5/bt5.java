package ra.bt5;

public class bt5 {
    public static void main(String[] args) {
        System.out.println("Số tự nhiên nhỏ nhất chia heets cho 5 - 7 - 11 đầu tiên là");
        int number = 1;
        while (true) {
         if (number%5==0&&number%7==0&&number%11==0){
             System.out.println(number);
             break;
         }
            number++;
        }
    }
}
