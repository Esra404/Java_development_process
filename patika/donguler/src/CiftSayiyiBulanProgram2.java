import java.util.Scanner;
public class CiftSayiyiBulanProgram2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        System.out.println("lütfen bir sayi grirniz");
        int sayi=scanner.nextInt();
        int ortalama=0;
        if(sayi>0){
            for(int i=0;i<=sayi;i++){
                if(i%3==0 && i%4==0){
                    ortalama = (ortalama+i);

                }

            }
            System.out.println("SAYILARIN ORTALAMASI  "+ortalama);
        }



    }
}
