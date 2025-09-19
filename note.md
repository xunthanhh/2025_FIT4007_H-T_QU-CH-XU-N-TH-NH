MÔ HÌNH HÓA UML ACOUNT 

+----------------------------+
|         Account            |
+----------------------------+
| - maSoTaiKhoan: String     |
| - soTien: double           |
+----------------------------+
| + Account(maSoTaiKhoan:String, soTien:double) |
| + getMaSoTaiKhoan(): String                     |
| + getSoTien(): double                           |
| + napTien(soTienNap: double): void             |
| + rutTien(soTienRut: double): void             |
| + chuyenTien(nguoiNhan: Account, soTienChuyen: double): void |
| + hienThiThongTin(): void                       |
+----------------------------+

MÔ HÌNH HÓA UML BOOK

+--------------------------------------------------+
|                     Book                         |
+--------------------------------------------------+
| - maSach: String                                 |
| - tenSach: String                                |
| - giaSach: double                                |
| - giamGia: double                                |
+--------------------------------------------------+
| + Book(maSach: String, tenSach: String)         |
| + Book(maSach: String, tenSach: String, giaSach: double, giamGia: double) |
| + getMaSach(): String                            |
| + setMaSach(maSach: String): void               |
| + getTenSach(): String                           |
| + setTenSach(tenSach: String): void             |
| + getGiaSach(): double                           |
| + setGiaSach(giaSach: double): void             |
| + getGiamGia(): double                           |
| + setGiamGia(giamGia: double): void             |
| + tinhGiaBan(): double                           |
| + hienThiThongTin(): void                        |
+--------------------------------------------------+

MÔ HÌNH HÓA UML CIRCLE

+---------------------------------+
|             Circle              |
+---------------------------------+
| - banKinh: double               |
+---------------------------------+
| + Circle()                       |
| + Circle(banKinh: double)        |
| + getBanKinh(): double           |
| + setBanKinh(banKinh: double): void |
| + input(): void                  |
| + output(): void                 |
| + tinhDienTich(): double         |
| + tinhChuVi(): double            |
+---------------------------------+

MÔ HÌNH HÓA UML STUDENT

+--------------------------------------------------+
|                     Student                      |
+--------------------------------------------------+
| - maSV: String                                   |
| - hoTen: String                                  |
| - namSinh: int                                   |
| - diaChi: String                                 |
+--------------------------------------------------+
| + Student(maSV: String, hoTen: String)          |
| + Student(maSV: String, hoTen: String, namSinh: int, diaChi: String) |
| + getMaSV(): String                              |
| + setMaSV(maSV: String): void                   |
| + getHoTen(): String                             |
| + setHoTen(hoTen: String): void                 |
| + getNamSinh(): int                              |
| + setNamSinh(namSinh: int): void                |
| + getDiaChi(): String                            |
| + setDiaChi(diaChi: String): void               |
| + tinhTuoi(): int                                |
| + hienThiThongTin(): void                        |
+--------------------------------------------------+
