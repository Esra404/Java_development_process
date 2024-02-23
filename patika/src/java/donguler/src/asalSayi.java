
public class asalSayi {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki asal sayılar:");


        for (int i=2;i<=100;i++){
            boolean asal=true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    asal =false;
                    break;
                }
            }
            if(asal){
                System.out.println(i+" ");
            }
        }
    }
}
