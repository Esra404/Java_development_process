import java.util.Scanner;
public class faktorielHesapla {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scanner.nextInt();
       int  sonuc=1;
        if(sayi>0){
            for (int i=1;i<=sayi;i++){
                sonuc *=i;

            }
        }
        System.out.println("fak="+sonuc);
    }
}
