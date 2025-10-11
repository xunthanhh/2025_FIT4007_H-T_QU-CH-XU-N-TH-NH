import java.util.ArrayList;

// Lớp cha
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // phương thức trừu tượng (phải override ở lớp con)
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}

// Nhân viên full-time
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Nhân viên part-time
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Chạy thử
public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Tạo danh sách nhân viên
        employees.add(new FullTimeEmployee("Nguyen Van A", 12000000));
        employees.add(new PartTimeEmployee("Tran Thi B", 80000, 60));
        employees.add(new PartTimeEmployee("Le Van C", 100000, 40));

        // Dùng đa hình: cùng gọi calculateSalary() nhưng kết quả khác nhau
        for (Employee e : employees) {
            System.out.println("Nhan vien: " + e.getName() +
                               " | Luong: " + e.calculateSalary());
        }
    }
}
