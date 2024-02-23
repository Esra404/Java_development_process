// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Ev ev = new Ev();

//       ev.setOdaSayisi(4);
//       ev.setOdaSayisi(3);
//       ev.setAdres("Ankara");
//
//       Ev esraninEvi = new Ev(2,3,"Elazığ");
//
//
//        System.out.println("Oda sayısı: " + ev.getOdaSayisi() + " Kapı Numarası: " + ev.getOdaSayisi() + " Adres: " + ev.getAdres());
//        System.out.println("Esranın Oda sayısı: " + esraninEvi.getOdaSayisi() + " Esranın Kapı Numarası: " + esraninEvi.getOdaSayisi() + " Esranın Adres: " + esraninEvi.getAdres());


        KiralikEv kiralikEv = new KiralikEv(4,3,"İzmir");
//        kiralikEv.setAdres("Ankara");
//        kiralikEv.setKapiNo(4);
//        kiralikEv.setOdaSayisi(3);
        kiralikEv.setKiraBedeli(10000);

        System.out.println(kiralikEv.getAdres() + " " + kiralikEv.getKiraBedeli());

    }
}



    }
}