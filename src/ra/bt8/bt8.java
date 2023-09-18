package ra.bt8;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        boolean check = false;
        do {
            System.out.println("Nhập độ dài cạnh a");
            a = sc.nextDouble();
            System.out.println("Nhập độ dài cạnh b");
            b = sc.nextDouble();
            System.out.println("Nhập độ dài cạnh c");
            c = sc.nextDouble();
            if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
                check = true;
            } else {
                System.out.println("Độ dài 3 cạnh a, b, c không đủ để cấu thành hình tam giác");
            }
        } while (!check);
        // chu vi hình tam giác
        double cv = a + b + c;
        System.out.println("Chu vi hình tam giác bằng " + cv);
        // 1 nửa chu vi hình tam giác
        double p = (double) cv / 2;
        double dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích hình tam giác bằng " + dt);
    }
}
