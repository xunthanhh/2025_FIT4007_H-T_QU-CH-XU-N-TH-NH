import java.util.Scanner;

class ArrayStats {
    private int[] arr;   // Mảng số nguyên
    private int n;       // Số lượng phần tử
    private Scanner sc;  // Đặt Scanner là thuộc tính dùng chung

    // Constructor khởi tạo Scanner
    public ArrayStats() {
        sc = new Scanner(System.in);
    }

    // Nhập dữ liệu từ bàn phím
    public void nhapDuLieu() {
        System.out.print("Nhap so luong phan tu cua mang: ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    // Tính tổng
    public int tinhTong() {
        int tong = 0;
        for (int x : arr) {
            tong += x;
        }
        return tong;
    }

    // Tính tích
    public long tinhTich() {
        long tich = 1;
        for (int x : arr) {
            tich *= x;
        }
        return tich;
    }

    // Tính giá trị trung bình
    public double tinhTrungBinh() {
        if (n == 0) return 0;
        return (double) tinhTong() / n;
    }

    // Hiển thị kết quả
    public void hienThiKetQua() {
        System.out.println("Tong cac phan tu cua mang: " + tinhTong());
        System.out.println("Tich cac phan tu cua mang: " + tinhTich());
        System.out.println("Gia tri trung binh cac phan tu cua mang: " + (int) tinhTrungBinh());
    }
}

public class Bai1 {
    public static void main(String[] args) {
        ArrayStats a = new ArrayStats();
        a.nhapDuLieu();
        a.hienThiKetQua();
    }
}
