public class ornek1 {

    public static void main(String[] args) {
        double ortalama=0;
        int toplam=0;
        int []dizi={12,12,33,4,2,5,7};
        for(int i=0;i< dizi.length;i++){
            toplam+=dizi[i];
        }
        ortalama=((double) toplam/dizi.length);
        System.out.println("bu dizinin ortalaması ="+ortalama);

    }



}
