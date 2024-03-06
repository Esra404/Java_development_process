import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("MACERA OYUNUNA HOŞGELDİNİZ");
        System.out.println("lütfen bir isim giriniz");
        //String playerName=input.nextLine();

        Player player=new Player("esra");
     System.out.println("sayın"+player.getName()+" karanlık adaya  hoşgeldiniz");
        System.out.println("LÜTFEN BİR KARAKTER SEÇİNİZ");
        player.selectChar();
    }
}
