import java.util.Scanner;
public class Sayiİslem {
    static int sayiİslem(int sayi) {
        if (sayi <= 0) {
            System.out.println("son değer" + sayi);
            sayi = +5;
            System.out.println("son değer" + sayi);

        } else {
            System.out.println("son değer" + sayi);
            sayiİslem(sayi - 5);
            System.out.println("son değer" + sayi);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int n=k.nextInt();
        k.close();
        sayiİslem(n);
    }




}
