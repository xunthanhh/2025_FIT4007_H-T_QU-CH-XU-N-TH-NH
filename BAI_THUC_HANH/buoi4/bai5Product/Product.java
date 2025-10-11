package buoi4.bai5Product;

import java.util.Scanner;

public class Product {
    private String productId;
    private String name;
    private double unitPrice;
    private double discountPercent; // 0 - 100

    // Constructor chỉ có productId và name
    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = 0;
        this.discountPercent = 0;
    }

    // Constructor đầy đú
    public Product(String productId, String name, double unitPrice, double discountPercent) {
        this.productId = productId;
        this.name = name;
        setUnitPrice(unitPrice);
        setDiscountPercent(discountPercent);
    }

    // Getters và Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0)
            this.unitPrice = unitPrice;
        else
            System.out.println("❌ Giá phải ≥ 0");
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 100)
            this.discountPercent = discountPercent;
        else
            System.out.println("❌ % giảm phải 0–100");
    }

    // Giá bán sau giảm
    public double getSalePrice() {
        return unitPrice * (1 - discountPercent / 100);
    }

    // Cập nhật đơn giá
    public void updatePrice(double newPrice) {
        setUnitPrice(newPrice);
    }

    // Áp dụng giảm giá thêm
    public void applyExtraDiscount(double morePercent) {
        if (morePercent < 0) return;
        discountPercent += morePercent;
        if (discountPercent > 100) discountPercent = 100;
    }

    // Hiển thị thông tin sản phẩm
    public void displayInfo() {
        System.out.println("ProductId: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Sale Price: " + getSalePrice());
        System.out.println("----------------------------");
    }

    // Main test
    public static void main(String[] args) {
        Product p = new Product("P001", "Laptop", 1500, 10);
        p.displayInfo();

        p.updatePrice(1800);
        p.applyExtraDiscount(5);
        p.displayInfo();
    }
}
