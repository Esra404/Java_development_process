public class KiralikEv extends Ev{
    private int odaSayisi;
    private int kapiNo;
    private String adres;

    public int getKapiNo(){
        return kapiNo;
    }

    //constructor yapısı
    public Ev(int kapiNo,int odaSayisi,String adres){
        this.kapiNo=kapiNo;
        this.odaSayisi=odaSayisi;
        this.adres=adres;
    }

    //constructor overloading

    public void setKapiNo(int kapiNo){
        this.kapiNo=kapiNo;
    }
    public String getAdres(String adres){
        this.adres=adres;
    }
    //encapsulation
    //okuma işlemi için oda sayısı
    public  int getOdaSayisi(){
        return odaSayisi;
    }
    //yazma işlemi için oda sayısı
    public void setOdaSayisi(int odaSayisi){
        this.odaSayisi=odaSayisi;
    }

}
