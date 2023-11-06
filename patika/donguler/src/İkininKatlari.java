import java.util.Scanner;

public class İkininKatlari {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sonuc=1;
        while (true) {
            int sayi = scanner.nextInt();
            if (sayi > 0) {
                for (int i = 1; i <= sayi; i++) {
                    sonuc *=2;
                    System.out.println("2^" + i + " = " + sonuc);


                }
            } else {
                System.out.println("geçersiz parametre");
            }

        }
    }
}
