
public class Main {
    public static void main(String[] args) {
    Ev ev=new Ev();
    ev.setOdaSayisi(4);
    ev.setOdaSayisi(3);
    ev.setAdres("ankara");

    Ev esraninEvi=new Ev(2,3,"elazığ");

        System.out.println("oda sayısı"+ev.getOdaSayisi()+"kapı numarası"+ev.getOdaSayisi(int i)+"adres"+ev.getAdres());
        System.out.println("esranın oda sayısı"+esraninEvi.getOdaSayisi()+"esranın kapı numarası"+esraninEvi.getOdaSayisi()+"esranın adresi"+esraninEvi.getAdres());


    }
}