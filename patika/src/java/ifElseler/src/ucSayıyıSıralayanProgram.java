import  java.util.Scanner;
public class ucSayıyıSıralayanProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.println("lütfen ilk sayıyı girinizz");
        sayi1 = scanner.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        sayi2 = scanner.nextInt();
        System.out.println("lütfen üçüncü sayıyı giriniz");
        sayi3 = scanner.nextInt();

        if (sayi1 > sayi2) {
        }
         else if (sayi1 > sayi3) {
                System.out.println("sayi 1 en büyüktür");

            } else if (sayi2>sayi3) {
                System.out.println("sayi1>sayi2>sayi3");

            }
        }
    }



