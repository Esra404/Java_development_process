
public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("esra",10,120,100);
        Fighter f2=new Fighter("berdan",20,85,85);

        Match match=new Match(f1,f2,85,195);
        match.run();


    }
}