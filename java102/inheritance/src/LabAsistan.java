public class LabAsistan extends Asistan{

    public LabAsistan(String adsoyad,String telefon,String eposta,String bolum,String unvan,String ofisSaati){
        super(adsoyad,telefon,eposta,bolum,unvan,ofisSaati);

    }

    public void derslereGir(){

    }
    @Override
    public void derseGir(){
        System.out.println(this.getAdSoyad()+"derse giriş yaptı"+this.getBolum()+"         hocanın bölümüdür");

    }



}
