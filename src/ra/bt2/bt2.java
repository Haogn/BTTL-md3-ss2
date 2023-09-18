package ra.bt2;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        // bai tap
        // hien thi cac loai hinh
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so de lua chon hinh dc in ra tu memu duoi day : ");
        System.out.println("1. Hinh chu nhat \n2. Hinh tam giac , vuong duoi - trai \n3. Hinh tam giac , vuong tren - trai");
        int selectMenu = sc.nextInt();
        switch (selectMenu){
            case 1 :
                System.out.println("Bạn đã chọn in ra màn hình hình chữ nhật");

                System.out.println("nhập chiều dài của hình chữ nhật ");
                int width = sc.nextInt();

                System.out.println("Nhập chiều rộng của hình chữ nhật");
                int height = sc.nextInt();

                rectangle(width, height);
                break;
            case 2 :
                System.out.println("Bạn đã chọn in ra màn hình tam giác , vuông dưới - trái");
                System.out.println("Nhập độ dài của cạnh hình tam giác");
                int cd = sc.nextInt();
                triangleBottonLeft(cd);
                break;
            case 3 :
                System.out.println("Bạn đã chọn in ra màn hình hình tam giác , vuông trên - trái");
                System.out.println("Nhập độ dài của cạnh hình tam giác");
                int dd = sc.nextInt();
                triangleTopLeft(dd) ;
                break;
            default:
                System.out.println("Không có lựa chọn này trong menu");
                break;
        }

    }

    // hình chữ nhật
    public static void rectangle(int width, int height) {
        System.out.println("KẾT QUẢ");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // hình tam giác , vuoong dưới - trai
    public static void triangleBottonLeft(int cd) {
        System.out.println("KẾT QUẢ");
        for ( int i = 1 ; i <= cd ; i++) {
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // hình chữ tam giác , vuông trên - trái
    public static void triangleTopLeft(int dd) {
        System.out.println("KẾT QUẢ");
        for ( int i = 0 ; i <= dd; i++) {
            for (int j = dd - 1  ; j >= i ; j--) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
