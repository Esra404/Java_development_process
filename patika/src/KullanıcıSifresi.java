import java.util.Scanner;
public class KullanıcıSifresi {
    public static void main(String[] args) {
//equals ile kıyalama yapmak için kulllanılır

        String dogruSifre="12345";
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your password");
        String girilenSifre= scanner.nextLine();
        
        if(girilenSifre.equals(dogruSifre)){
            System.out.println("Welcome");
            
        } else {
            System.out.println("Would you like to verify your password?");
            String sifresifirla = scanner.nextLine();


            if (sifresifirla.equalsIgnoreCase("evet")) {
                System.out.println("yeni şifre oluşturun");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre)) {
                    System.out.println("yeni şifre eski şifre ile aynı");
                } else {
                    System.out.println("şifre oluşturuldu");
                }
            }
                else{
                    System.out.println("şifre sıfırlanamadı");
                }


        }

        {
            
        }


    }


















}
