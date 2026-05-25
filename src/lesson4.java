import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = rd.nextInt(chars.length());
            result.append(chars.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên: " + result);
    }
}

