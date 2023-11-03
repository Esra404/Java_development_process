import java.util.Scanner;

public class CiftSayiyiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        *  3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

        int ortalama;
        int toplam=0;
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();

        for(int i=0;i<=sayi;i++){
            if(sayi%3==0 && sayi%4 ==0){
                toplam +=sayi;

            }
        }
        System.out.println("toplam= "+toplam);





    }
}
