package buoi3.Book;

//Buoi 3
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private double price;

    // Constructor đầy đủ tham số
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Phương thức in thông tin sách
    public void printInfo() {
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price + " VND");
        System.out.println("-----------------------");
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor khởi tạo tên thư viện
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Thêm sách vào thư viện
    public void addBook(Book b) {
        books.add(b);
    }

    // In toàn bộ sách
    public void printAllBooks() {
        System.out.println("Thư viện: " + name);
        System.out.println("Danh sách sách trong thư viện:");
        for (Book b : books) {
            b.printInfo();
        }
    }
}

public class BookLibary{
    public static void main(String[] args) {
        // Tạo thư viện
        Library lib = new Library("Thư viện Quốc Gia");

        // Tạo vài cuốn sách
        Book b1 = new Book("Lập trình Java", "Nguyễn Văn A", 75000);
        Book b2 = new Book("Cấu trúc dữ liệu", "Trần Văn B", 90000);
        Book b3 = new Book("Thuật toán ứng dụng", "Lê Thị C", 120000);

        // Thêm sách vào thư viện
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // In thông tin tất cả sách
        lib.printAllBooks();
    }
}

