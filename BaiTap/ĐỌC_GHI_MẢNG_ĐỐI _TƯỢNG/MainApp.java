import java.io.*;
import java.util.ArrayList;

public class MainApp {

    private static final String FILENAME = "students.dat";

    public static void main(String[] args) {
        // 1️⃣ Tạo dữ liệu mẫu
        ArrayList<Student> listToWrite = new ArrayList<>();
        listToWrite.add(new Student("B21DCCN001", "An Nguyen", 3.2));
        listToWrite.add(new Student("B21DCCN002", "Binh Le", 2.8));
        listToWrite.add(new Student("B21DCCN003", "Chi Pham", 3.5));

        // 2️⃣ Ghi danh sách xuống file
        writeObjectsToFile(listToWrite);

        // 3️⃣ Đọc danh sách từ file
        ArrayList<Student> listFromRead = readObjectsFromFile();

        // 4️⃣ In ra để kiểm chứng
        System.out.println("\n--- Du lieu da doc tu file " + FILENAME + ": ---");
        if (listFromRead != null) {
            for (Student s : listFromRead) {
                System.out.println(s);
            }
        }
    }

    // Hàm ghi ArrayList xuống file
    public static void writeObjectsToFile(ArrayList<Student> studentList) {
        System.out.println("--- Bat dau ghi file: " + FILENAME + " ---");
        try (FileOutputStream fos = new FileOutputStream(FILENAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(studentList);
            System.out.println("✅ Ghi file thành công!");

        } catch (IOException e) {
            System.out.println("❌ Loi khi ghi file: " + e.getMessage());
        }
    }

    // Hàm đọc ArrayList từ file
    public static ArrayList<Student> readObjectsFromFile() {
        System.out.println("\n--- Bat dau doc file: " + FILENAME + " ---");
        ArrayList<Student> studentList = null;

        try (FileInputStream fis = new FileInputStream(FILENAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            studentList = (ArrayList<Student>) ois.readObject();
            System.out.println("✅ Doc file thành công!");

        } catch (FileNotFoundException e) {
            System.out.println("❌ Khong tim thay file " + FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Loi khi doc file: " + e.getMessage());
        }

        return studentList;
    }
}
