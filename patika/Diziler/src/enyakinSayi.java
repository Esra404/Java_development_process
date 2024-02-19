public class enyakinSayi {
    public static void main(String[] args) {
        int [] dizi={12,23,-8,77,2,3};
        int sayi=5;

        int kEnYakin=Integer.MIN_VALUE;
        int bEnYakin=Integer.MAX_VALUE;

        for(int i: dizi){
            if(i<sayi&& sayi-i<sayi-kEnYakin){

                kEnYakin=i;
            }
            if(i>sayi&&i - sayi<bEnYakin-sayi){
                bEnYakin=sayi;

            }
        }
        System.out.println("girilen sayıdan küçük en yakın sayı :"+kEnYakin);
        System.out.println("girilen sayidan yakın en buyuk sayı"+bEnYakin);

/*
*
*public class EnYakinSayi {

    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        int enKucukYakinSayi = Integer.MAX_VALUE;
        int enBuyukYakinSayi = Integer.MIN_VALUE;

        for (int sayi : dizi) {
            if (sayi < girilenSayi && girilenSayi - sayi < girilenSayi - enKucukYakinSayi) {
                enKucukYakinSayi = sayi;
            }

            if (sayi > girilenSayi && sayi - girilenSayi < enBuyukYakinSayi - girilenSayi) {
                enBuyukYakinSayi = sayi;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enKucukYakinSayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enBuyukYakinSayi);
    }
}

*
*
*
* */

    }
}
