public class maxminBulanProgram {
    public static void main(String[] args) {

        int []dizi={121,2131,3242,34,2,43};
        int min=dizi[0];
        int max=dizi[0];

        for(int i : dizi){
            if(min>i){
                min=i;
            }
            else if(i>max){
                max=i;
            }


        }
        System.out.println("diziznin en büyük elemanı="+max);
        System.out.println("dizinin en küçük elemanı="+min);


    }
}
