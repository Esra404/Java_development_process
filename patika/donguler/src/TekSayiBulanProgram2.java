import java.util.Scanner;
public class TekSayiBulanProgram2 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int toplam = 0;
       System.out.println("lütfen bir sayi giriniz");

       while (true) {
           int sayi = scanner.nextInt();
           if (sayi % 2 == 1) {
               System.out.println("tek bir sayı gridiniz");

               break;
           } else {
               for (int i = 1; i <= sayi; i++) {
                   if (i % 4 == 0) {
                       toplam += i;


                   }
               }
           }

       }System.out.println("girilen sayıların toplamı= " + toplam);
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
       //eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

   }}