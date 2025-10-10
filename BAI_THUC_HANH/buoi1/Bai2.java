import java.util.*;

class StringProcessor {
    private String str;
    private Scanner sc;

    public StringProcessor() {
        sc = new Scanner(System.in);
    }

    // Nhập chuỗi từ bàn phím
    public void nhapChuoi() {
        System.out.print("Nhap chuoi: ");
        str = sc.nextLine();
    }

    // 1. Đếm ký tự và từ
    public void demKyTuVaTu() {
        int soKyTu = str.length();
        String[] tu = str.trim().split("\\s+");
        int soTu = (str.trim().isEmpty()) ? 0 : tu.length;

        System.out.println("Tong so ky tu (bao gom ca khoang trang): " + soKyTu);
        System.out.println("Tong so tu trong chuoi: " + soTu);
    }

    // 2. Kiểm tra Palindrome
    public void kiemTraPalindrome() {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();

        if (clean.equals(reverse)) {
            System.out.println("=> Chuoi la Palindrome.");
        } else {
            System.out.println("=> Chuoi khong phai la Palindrome.");
        }
    }

    // 3. Tìm ký tự xuất hiện nhiều nhất
    public void timKyTuXuatHienNhieuNhat() {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int max = Collections.max(countMap.values());
        System.out.print("Ky tu xuat hien nhieu nhat (" + max + " lan): ");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print("'" + entry.getKey() + "' ");
            }
        }
        System.out.println();
    }

    // 4. Thay thế và chuyển đổi hoa-thường
    public void thayTheVaChuyenDoi() {
        String replaced = str.replace('a', 'b');
        String converted = "";

        for (char c : replaced.toCharArray()) {
            if (Character.isUpperCase(c)) {
                converted += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                converted += Character.toUpperCase(c);
            } else {
                converted += c;
            }
        }

        System.out.println("Chuoi sau khi thay the 'a' -> 'b' va doi chu hoa/thuong: ");
        System.out.println(converted);
    }

    // 5. Loại bỏ khoảng trắng và ký tự trùng lặp
    public void loaiBoKhoangTrangVaTrungLap() {
        String noSpace = str.replaceAll("\\s+", "");
        StringBuilder result = new StringBuilder();

        for (char c : noSpace.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        System.out.println("Chuoi sau khi loai bo khoang trang va ky tu trung lap: ");
        System.out.println(result.toString());
    }

    // 6. Tìm và ghép chuỗi
    public void timVaGhepChuoi() {
        System.out.print("Nhap chuoi khac: ");
        String chuoiKhac = sc.nextLine();

        if (str.contains(chuoiKhac)) {
            System.out.println("=> Chuoi vua nhap la chuoi con cua chuoi ban dau.");
            System.out.println("Ket qua sau khi ghep: " + str + chuoiKhac);
        } else {
            System.out.println("=> Chuoi vua nhap khong phai chuoi con.");
        }
    }

    // 7. Kiểm tra chuỗi là số
    public void kiemTraChuoiLaSo() {
        if (str.matches("\\d+")) {
            int number = Integer.parseInt(str);
            System.out.println("Chuoi chi chua so. Gia tri so nguyen: " + number);
        } else if (str.matches(".*\\d.*")) {
            System.out.println("Chuoi co chua ky tu so, nhung khong phai toan so.");
        } else {
            System.out.println("Chuoi khong chua ky tu so nao.");
        }
    }
}
// ==========================
public class Bai2 {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        sp.nhapChuoi();

        System.out.println("\n1️⃣ Đếm ký tự và từ:");
        sp.demKyTuVaTu();

        System.out.println("\n2️⃣ Kiểm tra Palindrome:");
        sp.kiemTraPalindrome();

        System.out.println("\n3️⃣ Ký tự xuất hiện nhiều nhất:");
        sp.timKyTuXuatHienNhieuNhat();

        System.out.println("\n4️⃣ Thay thế & chuyển đổi hoa-thường:");
        sp.thayTheVaChuyenDoi();

        System.out.println("\n5️⃣ Loại bỏ khoảng trắng & trùng lặp:");
        sp.loaiBoKhoangTrangVaTrungLap();

        System.out.println("\n6️⃣ Tìm và ghép chuỗi:");
        sp.timVaGhepChuoi();

        System.out.println("\n7️⃣ Kiểm tra chuỗi là số:");
        sp.kiemTraChuoiLaSo();
    }
}
