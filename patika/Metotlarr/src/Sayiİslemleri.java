import java.util.Scanner;
public class Sayiİslemleri {




        // Recursive metot
        static void sayiIslem(int sayi) {
            if (sayi <= 0) {
                System.out.println("Son değer: " + sayi);
                sayi += 5;
                System.out.println("Son değer: " + sayi);
                return;
            }
            System.out.println("Son değer: " + sayi);
            sayiIslem(sayi - 5);
            System.out.println("Son değer: " + sayi);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int n = scanner.nextInt();

            sayiIslem(n);

            scanner.close();
        }
    }


