import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        System.out.println("lütfen bir sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                int sonuc=1;
                sonuc +=i;
                System.out.println("bu sayı bir mükemmel sayıdır bunu blen kendi bölenleri ise ==> "+i);
            }
        }
    }
}
