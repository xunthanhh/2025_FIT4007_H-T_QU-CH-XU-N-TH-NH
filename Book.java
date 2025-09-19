// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Book {
   private String maSach;
   private String tenSach;
   private double giaSach;
   private double giamGia;

   public Book(String maSach, String tenSach) {
      this.maSach = maSach;
      this.tenSach = tenSach;
   }

   public Book(String maSach, String tenSach, double giaSach, double giamGia) {
      this.maSach = maSach;
      this.tenSach = tenSach;
      this.giaSach = giaSach;
      this.giamGia = giamGia;
   }

   public String getMaSach() {
      return this.maSach;
   }

   public void setMaSach(String maSach) {
      this.maSach = maSach;
   }

   public String getTenSach() {
      return this.tenSach;
   }

   public void setTenSach(String tenSach) {
      this.tenSach = tenSach;
   }

   public double getGiaSach() {
      return this.giaSach;
   }

   public void setGiaSach(double giaSach) {
      this.giaSach = giaSach;
   }

   public double getGiamGia() {
      return this.giamGia;
   }

   public void setGiamGia(double giamGia) {
      this.giamGia = giamGia;
   }

   public double tinhGiaBan() {
      return this.giaSach - this.giamGia;
   }

   public void hienThiThongTin() {
      System.out.println("- Ma so sach: " + this.maSach);
      System.out.println("- Ten sach: " + this.tenSach);
      System.out.println("- Gia sach: " + this.giaSach);
      System.out.println("- Giam gia: " + this.giamGia);
   }

   public static void main(String[] args) {
      Book sach = new Book("B1234", "Mindset", 70000.0, 7000.0);
      System.out.println("Thong tin quyen sach hien tai:");
      sach.hienThiThongTin();
      System.out.println("\nGia ban cua sach: " + sach.tinhGiaBan());
      sach.setGiamGia(24000.0);
      System.out.println("\nThong tin quyen sach sau khi cap nhat:");
      sach.hienThiThongTin();
      System.out.println("\nGia ban cua sach: " + sach.tinhGiaBan());
   }
}

