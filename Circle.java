// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
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

   public void input() {
      Scanner sc = new Scanner(System.in);
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
      return 6.283185307179586 * this.banKinh;
   }

   public static void main(String[] args) {
      Circle c1 = new Circle();
      c1.output();
      Circle c2 = new Circle();
      c2.input();
      c2.output();
      System.out.println("Dien tich hinh tron: " + c2.tinhDienTich());
      System.out.println("Chu vi hinh tron: " + c2.tinhChuVi());
   }
}

