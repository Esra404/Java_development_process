public class overloading {


    static void print(){
        System.out.println("merhaba dünya");
    }

    static  void print(int a){
        System.out.println(a);
    }
    static  int print(int c ,int b){
        return c+b;

    }
    public static void main(String[] args) {
        print();
        print(2);
        System.out.println(print(4,5));
    }
}
