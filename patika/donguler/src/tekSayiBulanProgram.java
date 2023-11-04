import java.util.Scanner;
public class tekSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul
        // eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        int sonuc = 0;

        while (true) {
            System.out.println("lütfen bir sayı giriniz");
            int sayi = scanner.nextInt();
            if (sayi < 0) {
                System.out.println("negatif bir dayi gridiniz");
                break;
            }
            if (sayi % 2 == 1) {
                sonuc +=sayi;


            }
            System.out.println("girilen tek sayiların toplamı="+sonuc);

        }
    }}
