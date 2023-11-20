import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaçıncı fibonacci sayıyı bulmak istersin");
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        if(n==1){
            System.out.println("fibonacci sayısının "+n+".elemanı"+a);
        }else if(n==2){
            System.out.println("fibonacci sayısının "+n+".elemanı"+b);

        }else{
            int fib=0;
            for(int i=3;i<=n;i++){
                fib =a+b;
                a=b;
                b=fib;
            }
            System.out.println("fibonacci serisinin "+n+".elemanı :"+fib);
        }
    }
}
