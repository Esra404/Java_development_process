import  java.util.Scanner;
public class sinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int kimya,fizik,tarih,bio,mat,ortalama;
        System.out.println("SINIF GEÇME PLATFORMUNA HOŞGELDİNİZ");
        System.out.println("lütfen matematik notunuzu giriniz");
        mat=scanner.nextInt();
        System.out.println("lütfen tarih notunuzu giriniz");
        tarih=scanner.nextInt();
        System.out.println("lütfen fizik notunu giriniz");
        fizik=scanner.nextInt();
        System.out.println("lütfen biyoloji notunu giriniz");
        bio=scanner.nextInt();
        System.out.println("lütfen kimya notunuzu giirniz");
        kimya=scanner.nextInt();
        ortalama=(kimya+tarih+mat+fizik+bio)/5;
        if (ortalama>=55){
            System.out.println("sınıfı geçtiniz");
        }else {
            System.out.println("sınıfı geçemediniz tekrar deneyiniz");
        }
    }
}
