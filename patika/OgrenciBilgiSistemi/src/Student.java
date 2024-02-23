public class Student {
    String name;
    String stNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, String stNo,String classes,Course c1,Course c2,Course c3 ){
        this.name=name;
        this.stNo=stNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=avarage;
        this.isPass=isPass;

    }

    public void addBulExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
        }

    }
    public void printNote(){
        System.out.println(this.c1.name=" notu "+c1.note);
        System.out.println(this.c2.name=" notu "+c2.note);
        System.out.println(this.c3.name= " notu "+c3.note);
    }

}
