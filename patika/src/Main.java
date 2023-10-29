import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dogruSifre = "12345"; // Örnek doğru şifre, bu kısmı kendi şifrenizle değiştirin.

        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Şifre doğru. Giriş başarılı.");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String sifreSifirlaSecimi = scanner.nextLine();

            if (sifreSifirlaSecimi.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifre oluşturun: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre)) {
                    System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen başka bir şifre girin.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    // Yeni şifreyi saklamak için uygun bir mekanizma eklemelisiniz.
                }
            } else {
                System.out.println("Şifre sıfırlanmadı.");
            }
        }

        scanner.close();
    }
}
