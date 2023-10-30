import java.util.Scanner;
public class etkinlikOgrenme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("etkinlik öğrenme programına hoşgeldiniz");
/*
 Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
int sicaklik;
        System.out.println("Lütfen sıcaklık değerini giriniz");
        sicaklik=scanner.nextInt();
        if (sicaklik<5){
            System.out.println("kayak yapabilirsiniz");
        } else if (sicaklik>5 || sicaklik<10) {
            System.out.println("sinemaya gidebilirsiniz");

        } else if (sicaklik>15 || sicaklik<25) {
            System.out.println("piknik yapabilirsiniz");
        }
        else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
