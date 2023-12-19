import java.util.Scanner;
public class tersUcgen {

    //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
    //basamak bul
    //o değişkeni tut ve yıldızı tersten yaz

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int temp=scanner.nextInt();


        int basamak=0;
        while (temp!=0){

            temp /= 10;
            basamak++;
        }
        for (int i=basamak;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
