public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

public OgretimGorevlisi(String adsoyad,String telefon,String eposta,String bolum,String unvan){
    super(adsoyad,telefon,eposta,bolum,unvan);
    this.kapiNo=kapiNo;


}

public String getKapiNo(){
    return kapiNo;
}
public void setKapiNo(String kapiNo){
    this.kapiNo=kapiNo;
}
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+"okula giriş yaptı");
    }

}
