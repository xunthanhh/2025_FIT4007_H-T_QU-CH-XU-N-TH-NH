package buoi3.MathUtils;

public class MathUtils {

    // max hai số nguyên
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // max ba số nguyên
    public static int max(int a, int b, int c) {
        int maxAB = (a > b) ? a : b;
        return (maxAB > c) ? maxAB : c;
    }

    // max hai số thực
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // Main để kiểm thử
    public static void main(String[] args) {
        // Kiểm thử hai số nguyên
        int maxInt2 = MathUtils.max(5, 10);
        System.out.println("Max của 5 và 10 là: " + maxInt2);

        // Kiểm thử ba số nguyên
        int maxInt3 = MathUtils.max(3, 7, 5);
        System.out.println("Max của 3, 7, 5 là: " + maxInt3);

        // Kiểm thử hai số thực
        double maxDouble2 = MathUtils.max(4.5, 3.7);
        System.out.println("Max của 4.5 và 3.7 là: " + maxDouble2);
    }
}
