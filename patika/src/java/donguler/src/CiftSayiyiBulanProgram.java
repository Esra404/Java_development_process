import java.util.Scanner;

public class CiftSayiyiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        int toplam=0;
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%2==0){
                toplam  +=i ;

            }
        }
        System.out.println("toplam= "+toplam);





    }
}
