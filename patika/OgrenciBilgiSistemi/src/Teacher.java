public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher(String  name,String  mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;


    }
    void print(){
        System.out.println("adı:"+this.name);
        System.out.println("nosu: "+this.mpno);
        System.out.println(("branşı: "+this.branch));
    }

}
