import java.util.Scanner;

public class tekSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.println("Lütfen bir sayı giriniz (negatif sayı girmek için q tuşuna basın):");
            int sayi = scanner.nextInt();

            if (sayi < 0) {
                System.out.println("Negatif sayı girdiniz.");
                break;
            } else if (sayi > 0) {
                for (int i = 1; i <= sayi; i++) {
                    if (i % 2 == 1) {
                        toplam += i;
                    }
                }
            } else {
                System.out.println("Bu koşul sağlanamaz");
            }
            System.out.println("Tek sayıların toplamı = " + toplam);
        }
    }
}
