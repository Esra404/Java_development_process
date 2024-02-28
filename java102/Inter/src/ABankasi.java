public class ABankasi {
    private  String bankaAdi;
    private  String terminaId;
    private String password;

    public ABankasi(String bankaAdi,String terminaId,String password){
        this.bankaAdi=bankaAdi;
        this.terminaId=terminaId;
        this.password=password;
    }

    public void connect(){
        System.out.println(this.bankaAdi+"bağlanıldı");
    }

    public void sendCardInfo(String cardNumber,String expiryDate,String cvc){
        System.out.println("işlem başarılı");
    }
    public String getBankaAdi(){
        return bankaAdi;
    }
    public void setBankaAdi(String bankaAdi){
        this.bankaAdi=bankaAdi;
    }
    public  String getTerminaId(){
        return terminaId;
    }
    public void setTerminaId(String terminaId){
        this.terminaId=terminaId;
    }

    public String getPassword(){
        return  password;
    }
    public  void setPassword(String password){
        this.password=password;
    }
}
