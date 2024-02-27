public class Kitap {
private  int sayfaSayisi;
private String yazar,kitapAdi;

Kitap(String yazar,String kitapAdi,int sayfaSayisi) {
    this.yazar = yazar;
    this.kitapAdi = kitapAdi;
    this.sayfaSayisi = sayfaSayisi;
    if (sayfaSayisi < 1) {
        this.sayfaSayisi = 10;
    } else {
        this.sayfaSayisi = sayfaSayisi;
    }
}
    public int getSayfaSayisi(){
        return this.sayfaSayisi;
    }
    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi=sayfaSayisi;
    }







}
