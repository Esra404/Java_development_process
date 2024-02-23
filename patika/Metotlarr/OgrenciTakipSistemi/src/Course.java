
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;



    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.sozlu=sozlu;

        int sozlu=0;
        int note=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("ders kodu ve içerikler eşleşmiyor");
        }
    }
    // teacher sınıfındaki tüm özellikler teacher nesnesine taşınır!!
    void printTeacher(){

        this.teacher.print();
    }
 /*   void sozluNotu(Student avarage,int nott,double ort){
        nott=0;
              if(code=="101"){
    }
*/
}
