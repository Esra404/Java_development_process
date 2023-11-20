
import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
        System.out.println("lütfen iki sayı gir");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();




        int ebob=1;
        int ekok;
        int i=1;
        while (sayi1>i && sayi2>i){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            i++;
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("ebob "+ebob);
        System.out.println("ekok "+ekok);



    }
}
