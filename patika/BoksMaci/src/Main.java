
public class Main {
    public static void main(String[] args) {


        Fighter f1=new Fighter("a ",16,120,100);
        Fighter f2=new Fighter("b ",12,85,85);

        Match match=new Match(f1,f2,80,100);

        match.run();
    }
}