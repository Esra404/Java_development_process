import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Course tarih =new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","102","FZK");
        Course biyo = new Course("Biyoloji","103","BIO");

        //nesneler bizim içi veri tipi oluyor onun adına işlem yapılabilir.Bir sınıfın niteliğine diğer bir sınıfın niteliği atanabilir.

        Teacher t2=new Teacher("graham bell","000","FZK");
        Teacher t1=new Teacher("mahmut hoca","055","TRH");
        Teacher t3=new Teacher("külyutmaz","222","BIO");

        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        biyo.addTeacher(t3);
        //tarih.printTeacherInfo();

        Student s1=new Student("inek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,200,50,45);
        Student s2 =new Student("düdük necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,50);
        s1.isPass();
        s2.isPass();

    }
}