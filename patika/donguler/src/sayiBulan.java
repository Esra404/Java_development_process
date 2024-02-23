import java.util.Arrays;
import java.util.Scanner;

public class sayiBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girmek istediğiniz uzunlukta sayı giriniz:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Bu değer aralığı geçersizdir.");
            return; // Programı sonlandır
        }

        int[] dizi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sayı giriniz:");
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);

        int min = dizi[0];
        int max = dizi[n - 1];
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
