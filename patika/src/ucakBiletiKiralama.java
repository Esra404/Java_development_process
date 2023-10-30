import java.util.Scanner;
public class ucakBiletiKiralama {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("********uçak kiralama uygulması*****");
    int mesafe,yas,normalTutar,İndirimliTutar,yasİndirimi,yasİndirimOrani,Biletİndirimi,ToplamTutar;
        System.out.println("lütfen gideceğiniz mesafeki km şeklinde giriniz");
        mesafe=scanner.nextInt();
        System.out.println("lütfen yaşınızı giriniz");
        yas=scanner.nextInt();
        System.out.println("lütfen bilet tipinizi giri");
     /*   int biletTipi=scanner.nextInt();
        if(biletTipi==1){
            İndirimliTutar*0.20;
        } else if (biletTipi==2) {
            İndirimliTutar*1;

        }



        normalTutar=mesafe*0.10;
        yasİndirimi=normalTutar*yasİndirimOrani;
        İndirimliTutar=normalTutar-yasİndirimi;
        Biletİndirimi=İndirimliTutar*0.20;



* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
    }
}
