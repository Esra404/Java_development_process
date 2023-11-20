import java.util.Scanner;
public class usluSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("üsü alınacak sayi");
        int sayi=scanner.nextInt();
        System.out.println("üs olunacak sayi");
        int us= scanner.nextInt();

        int sonuc=1;

        for(int i=1;i<=us;i++){
            sonuc *=sayi;
        }
        System.out.println(sayi+"^"+us+"="+sonuc);

    }
}
