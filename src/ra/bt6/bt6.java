package ra.bt6;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kỳ");
        int choice = sc.nextInt();
        int select;
        do {
            System.out.println("1. Kiểm tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số đó có chia hết cho 3 không ? ");
            System.out.println("4. Thoát chương trình");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    if (choice % 2 == 0) {
                        System.out.println(choice + " là số chẵn");
                    } else {
                        System.out.println(choice + " là số lẻ");
                    }
                    break;
                case 2:
                    if (choice <= 1) {
                        System.out.println(choice + " không phải số nguyên tố");
                    } else {
                    boolean ischeck = true ;
                    for (int i = 2 ; i <= Math.sqrt(choice) ; i++) {
                        if (choice%i==0) {
                            ischeck= false ;
                            break;
                        }
                    }
                    if (ischeck) {
                        System.out.println(choice+ " là số nguyên tố");
                    } else {
                        System.out.println(choice+ " không phải số nguyên tố");
                    }
                    }
                    break;
                case 3:
                    if (choice % 3 == 0) {
                        System.out.println(choice + " chia hết cho 3");
                    } else {
                        System.out.println(choice + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình !!!!");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp , vui lòng chọn lại ");
            }
        } while (select != 4);

    }
}
