import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println( "lütfen bir sayı griin");
        String kelime=scanner.nextLine();

        if(isPolindom(kelime)){
            System.out.println(kelime+"palindromiktir");
        }else{
            System.out.println(kelime+"palindromik değildir");
        }}

        private static boolean isPolindom(String kelime){
            kelime=kelime.toLowerCase().replaceAll("\\s"," ");
            System.out.println(kelime);

            int uzunluk=kelime.length();
            for(int i=0;i<uzunluk/2;i++){
                if(kelime.charAt(i) != kelime.charAt(uzunluk -1 - i)){
                    return false;
                }
            }
            return true;


    }
}