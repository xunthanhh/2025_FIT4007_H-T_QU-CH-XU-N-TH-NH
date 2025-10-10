import java.util.*;

class IntArrayProcessor {
    private int[] arr;

    public void inputArray(Scanner sc) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // 1. Tính trung bình cộng các số lẻ ở vị trí chẵn
    public double averageOddAtEvenPosition() {
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        return (count == 0) ? 0 : (double) sum / count;
    }

    // 2. Tìm số lớn nhất trong mảng
    public int findMax() {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // 3. Tìm vị trí các số nhỏ nhất
    public List<Integer> findMinPositions() {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) pos.add(i);
        }
        return pos;
    }

    // 4. Đếm số chính phương
    public int countPerfectSquares() {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                int sqrt = (int) Math.sqrt(num);
                if (sqrt * sqrt == num) count++;
            }
        }
        return count;
    }

    // 5. Hiển thị các số nguyên tố
    public void displayPrimes() {
        System.out.print("Các số nguyên tố trong mảng: ");
        for (int num : arr) {
            if (isPrime(num)) System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. Thay thế các phần tử âm bằng 0
    public void replaceNegativeWithZero() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
    }

    // 7. Xóa các phần tử âm
    public void removeNegatives() {
        arr = Arrays.stream(arr).filter(x -> x >= 0).toArray();
    }

    // 8. Sắp xếp mảng tăng dần
    public void sortAscending() {
        Arrays.sort(arr);
    }

    public void displayArray() {
        System.out.println(Arrays.toString(arr));
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntArrayProcessor processor = new IntArrayProcessor();

        processor.inputArray(sc);

        System.out.println("\n1️⃣ Trung bình cộng các số lẻ ở vị trí chẵn: " + processor.averageOddAtEvenPosition());
        System.out.println("2️⃣ Số lớn nhất trong mảng: " + processor.findMax());
        System.out.println("3️⃣ Vị trí các số nhỏ nhất: " + processor.findMinPositions());
        System.out.println("4️⃣ Số lượng số chính phương: " + processor.countPerfectSquares());
        processor.displayPrimes();

        processor.replaceNegativeWithZero();
        System.out.println("6️⃣ Mảng sau khi thay phần tử âm bằng 0:");
        processor.displayArray();

        processor.removeNegatives();
        System.out.println("7️⃣ Mảng sau khi xóa phần tử âm:");
        processor.displayArray();

        processor.sortAscending();
        System.out.println("8️⃣ Mảng sau khi sắp xếp tăng dần:");
        processor.displayArray();
    }
}

