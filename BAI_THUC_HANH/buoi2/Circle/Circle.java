import java.util.Scanner;

public class Circle {
    private double banKinh;

    public Circle() {
        this.banKinh = 1.0;
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return this.banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // 👇 Truyền Scanner từ bên ngoài vào, không tạo mới trong hàm
    public void input(Scanner sc) {
        System.out.print("Nhap ban kinh r: ");
        this.banKinh = sc.nextDouble();
    }

    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r: " + this.banKinh);
    }

    public double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 👈 chỉ tạo 1 lần duy nhất

        Circle c1 = new Circle();
        c1.output();

        Circle c2 = new Circle();
        c2.input(sc);
        c2.output();

        System.out.println("Dien tich hinh tron: " + c2.tinhDienTich());
        System.out.println("Chu vi hinh tron: " + c2.tinhChuVi());

        sc.close(); // 👈 đóng Scanner cuối chương trình
    }
}
