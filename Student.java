// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.time.Year;

public class Student {
   private String maSV;
   private String hoTen;
   private int namSinh;
   private String diaChi;

   public Student(String maSV, String hoTen) {
      this.maSV = maSV;
      this.hoTen = hoTen;
   }

   public Student(String maSV, String hoTen, int namSinh, String diaChi) {
      this.maSV = maSV;
      this.hoTen = hoTen;
      this.namSinh = namSinh;
      this.diaChi = diaChi;
   }

   public String getMaSV() {
      return this.maSV;
   }

   public void setMaSV(String maSV) {
      this.maSV = maSV;
   }

   public String getHoTen() {
      return this.hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public int getNamSinh() {
      return this.namSinh;
   }

   public void setNamSinh(int namSinh) {
      this.namSinh = namSinh;
   }

   public String getDiaChi() {
      return this.diaChi;
   }

   public void setDiaChi(String diaChi) {
      this.diaChi = diaChi;
   }

   public int tinhTuoi() {
      int namHienTai = Year.now().getValue();
      return namHienTai - this.namSinh;
   }

   public void hienThiThongTin() {
      System.out.println("- Ma sinh vien: " + this.maSV);
      System.out.println("- Ho ten: " + this.hoTen);
      System.out.println("- Nam sinh: " + this.namSinh);
      System.out.println("- Dia chi: " + this.diaChi);
   }

   public static void main(String[] args) {
      Student sv = new Student("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");
      System.out.println("Thong tin sinh vien:");
      sv.hienThiThongTin();
      System.out.println("\nTuoi cua sinh vien: " + sv.tinhTuoi() + " tuoi");
   }
}

