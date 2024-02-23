import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        double sayi=scanner.nextDouble();
        double toplam=0;
        for(double i=1;i<=sayi;i++){
            toplam +=(1/i);
        }
        System.out.println("sonuç="+toplam);
    }
}
