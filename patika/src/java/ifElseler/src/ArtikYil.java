import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        System.out.println("ARTIK YIL HESAPLAMA ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yil=scanner.nextInt();
        if((yil%4 == 0 && yil%100 != 0)||(yil % 400 == 0)){
            System.out.println("girdiğiniz yıl arik yıldır");
        }
        else {
            System.out.println("girdiğiniz yıl arık yıl değildir");
        }
    }
}
