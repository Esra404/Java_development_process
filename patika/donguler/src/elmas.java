import java.util.Scanner;
public class elmas {//anlamadım
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int height = scanner.nextInt();

        int space = height / 2;
        int star = 1;

        // Elmasın üst yarısı
        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
            space--;
            star += 2;
        }

        // Elmasın alt yarısı
        space = 1;
        star = height - 2;

        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
            space++;
            star -= 2;
        }
    }
}

