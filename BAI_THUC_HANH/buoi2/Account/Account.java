// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Account {
   private String maSoTaiKhoan;
   private double soTien;

   public Account(String maSoTaiKhoan, double soTien) {
      this.maSoTaiKhoan = maSoTaiKhoan;
      this.soTien = soTien;
   }

   public String getMaSoTaiKhoan() {
      return this.maSoTaiKhoan;
   }

   public double getSoTien() {
      return this.soTien;
   }

   public void napTien(double soTienNap) {
      if (soTienNap > 0.0) {
         this.soTien += soTienNap;
         System.out.println("✅ Ban da nap " + soTienNap + " vao tai khoan " + this.maSoTaiKhoan);
      } else {
         System.out.println("❌ So tien nap khong hop le!");
      }

   }

   public void rutTien(double soTienRut) {
      if (soTienRut > 0.0 && soTienRut <= this.soTien) {
         this.soTien -= soTienRut;
         System.out.println("✅ Ban da rut " + soTienRut + " tu tai khoan " + this.maSoTaiKhoan);
      } else {
         System.out.println("❌ So tien rut khong hop le hoac khong du!");
      }

   }

   public void chuyenTien(Account nguoiNhan, double soTienChuyen) {
      if (soTienChuyen > 0.0 && soTienChuyen <= this.soTien) {
         this.soTien -= soTienChuyen;
         nguoiNhan.soTien += soTienChuyen;
         System.out.println("✅ Chuyen " + soTienChuyen + " den tai khoan " + nguoiNhan.maSoTaiKhoan + " thanh cong!");
      } else {
         System.out.println("❌ Chuyen tien that bai!");
      }

   }

   public void hienThiThongTin() {
      System.out.println("- Ma so tai khoan: " + this.maSoTaiKhoan);
      System.out.println("- So du hien tai: " + this.soTien);
   }
}
