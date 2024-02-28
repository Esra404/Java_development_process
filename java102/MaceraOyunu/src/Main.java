import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Game g1=new Game();
        g1.start();
        Player p1=new Player(12,23,32,"esra");
        p1.selectChar();
    }
}
