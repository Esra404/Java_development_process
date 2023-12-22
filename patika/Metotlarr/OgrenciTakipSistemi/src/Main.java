import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("mahmut hoca","055","TRH");
        //nesneler bizim içi veri tipi oluyor onun adına işlem yapılabilir.Bir sınıfın niteliğine diğer bir sınıfın niteliği atanabilir.

        Teacher t2=new Teacher("graham bell","FZK","000");

        Teacher t3=new Teacher("külyutmaz","BIO","111");
        Course tarih =new Course("Tarih","101","TRH",t1);

        Course fizik=new Course("Fizik","102","FZK",t2);
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","101","BIO",t3);

        biyo.addTeacher(t3);
        tarih.addTeacher(t1);

        //tarih.printTeacherInfo();

        Student s1=new Student("inek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,200,50);
        Student s2 =new Student("düdük necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s1.isPass();

    }
}