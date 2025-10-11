package buoi4.bai6Rectangle;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    // Constructor mặc định 1x1
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor có tham số
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getters & Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println("❌ Chiều rộng phải > 0");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("❌ Chiều cao phải > 0");
    }

    // Diện tích
    public double area() {
        return width * height;
    }

    // Chu vi
    public double perimeter() {
        return 2 * (width + height);
    }

    // Nhập từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập width (>0): ");
            width = sc.nextDouble();
        } while (width <= 0);

        do {
            System.out.print("Nhập height (>0): ");
            height = sc.nextDouble();
        } while (height <= 0);
    }

    // Xuất thông tin
    public void output() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("-------------------------");
    }

    // Main test
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.output();

        r.input();
        r.output();
    }
}

