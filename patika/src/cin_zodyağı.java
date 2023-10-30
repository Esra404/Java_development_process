import java.util.Scanner;

public class cin_zodyağı {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println( "lütfen doğum yılınızı giriniz");
        int yas=scanner.nextInt();
        int sonuc;
        if(yas%12==0){
            System.out.println("maymun");
        } else if (yas%12==1) {
            System.out.println("horoz");
        }
        else if (yas%12==2) {
            System.out.println("köpek");
        }
        else if (yas%12==3) {
            System.out.println("domuz");
        }
        else if (yas%12==4) {
            System.out.println("fare");
        }
        else if (yas%12==5) {
            System.out.println("öküz");
        }
        else if (yas%12==6) {
            System.out.println("kaplan");
        }
        else if (yas%12==7) {
            System.out.println("tavşan");
        }
        else if (yas%12==8) {
            System.out.println("ejderha");
        }
        else if (yas%12==9) {
            System.out.println("yılan");
        }
        else if (yas%12==10) {
            System.out.println("at");
        }
        else if (yas%12==11) {
            System.out.println("koyun");
        }

    }
}
