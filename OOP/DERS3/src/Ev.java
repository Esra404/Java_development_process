public class Ev {
    private int odaSayisi;
    private int kapiNo;
    private String adres;

    public int getKapiNo() {
        return kapiNo;
    }



    // Costructor Alanı
    public Ev(int kapiNo, int odaSayisi, String adres){
        this.kapiNo = kapiNo;
        this.odaSayisi = odaSayisi;
        this.adres = adres;
    }

    // Constructor Overloading
    public Ev(){

    }



    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    // Encapsulation
    // Okuma İşlemi oda sayısı
    public int getOdaSayisi(){
        return odaSayisi;
    }
    // Yazma İşlemi oda sayısı
    public void setOdaSayisi(int odaSayisi){
        this.odaSayisi = odaSayisi;
    }


    public  void yazdir(){
        System.out.println("Bu bir evdir");
    }

}
