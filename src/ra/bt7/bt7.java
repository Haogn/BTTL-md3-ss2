package ra.bt7;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int choice ;
        do {
            System.out.println("1 . Tính chu vi và diện tích hình chữ nhật ");
            System.out.println("2 . Tính chu vi và diện tích hình tam giác ");
            System.out.println("3 . Tính chu vi và diện tích hình hình tròn ");
            System.out.println("4 . Thoát chương trình ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Nhập chiều dài của hình chữ nhật");
                    int width = sc.nextInt();
                    System.out.println("Nhập chiều rộng của hình chữ nhật");
                    int height = sc.nextInt();
                    //tính chu vi và diện tích
                    int cvhcn = (width + height) * 2 ;
                    System.out.println("Chu vi hình chữ nhật bằng " + cvhcn);
                    int dthcn = width * height ;
                    System.out.println("Diện tích hình chữ nhật bằng " + dthcn );
                    break;
                case 2 :
                    System.out.println("Nhập chiều dài cạnh a");
                    int a = sc.nextInt();
                    System.out.println("Nhập chiều dài cạnh b");
                    int b = sc.nextInt();
                    System.out.println("Nhập chều dài cạnh c");
                    int c = sc.nextInt();
                    // tính chu vi và diện tích
                    int cvhtg = a + b + c ;
                    System.out.println("Chu vi hình tam giác bằng " + cvhtg);
                    // tính nửa của chu vi hình tam giác
                    double p = (double) cvhtg/2;
                    double dthtg = Math.sqrt(p*(p - a)*(p - b)*(p - c)) ;
                    int intDthtg = (int) dthtg;
                    System.out.println("Diện tích hình tam giác " + intDthtg);
                    break;
                case 3 :
                    System.out.println("Nhập đường kính của hình tròn ");
                    int d = sc.nextInt();
                    double r = d/2 ;
                    double Pi = 3.14 ;
                    // tính chu vi và diện tích của hình tròn
                    double cvht = d * Pi ;
                    System.out.println("chu vi hình tròn bằng " +cvht);
                    double dtht = r*r * Pi ;
                    System.out.println("Diện tích hình tròn bằng " + dtht);
                    break;
                case 4 :
                    System.out.println("❌❌❌ Thoát chương trình");
            }
        } while (choice!= 4) ;

    }
}
