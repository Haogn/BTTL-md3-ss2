package ra.bt1;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        // bai tap
        // tinh cac so chan trong chuoi do ng dung nhap vao tu ban phim
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao tu ban phim 2 so min va max");
        int max , min, sum = 0 ;
        System.out.println("Nhap so nho nhat ( min )");
        min = sc.nextInt();
        System.out.println("Nhap so lon nhat ( max )");
        max = sc.nextInt();
        for (int i = min ; i <= max ; i++ ) {
            if (i%2==0) {
                sum += i ;
            }
        }
        System.out.println("Tong cac so chan bat dau tu " + min + " den " + max +" = " + sum );
    }
}
