package buoi3.BankAccount;

public class BankAccount {
    // 1️⃣ Thuộc tính private
    private String accountNumber;
    private double balance;

    // 2️⃣ Hàm khởi tạo đầy đủ tham số
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0; // Không cho phép số dư âm
    }

    // 3️⃣ Getter & Setter (kiểm tra số dư không âm)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("❌ Số dư không thể âm!");
    }

    // 4️⃣ Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Nạp thành công: " + amount);
        } else {
            System.out.println("❌ Số tiền nạp phải lớn hơn 0!");
        }
    }

    // 5️⃣ Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Rút thành công: " + amount);
        } else if (amount > balance) {
            System.out.println("❌ Số dư không đủ để rút!");
        } else {
            System.out.println("❌ Số tiền rút phải lớn hơn 0!");
        }
    }

    // 6️⃣ Phương thức hiển thị thông tin tài khoản
    public void displayInfo() {
        System.out.println("📘 Số tài khoản: " + accountNumber);
        System.out.println("💰 Số dư hiện tại: " + balance);
    }

    // 7️⃣ Hàm main để chạy thử
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789", 5000);
        acc.displayInfo();

        acc.deposit(1500);
        acc.withdraw(2000);
        acc.setBalance(-500); // test setter kiểm tra âm
        acc.displayInfo();
    }
}
