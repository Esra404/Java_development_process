
public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("esra","121","fizik");
        Teacher t2=new Teacher("derya","123","mat");
        Teacher t3=new Teacher("külyutmaz","bio","111");

        Course tarih =new Course("TARİH","101","trh");
        tarih.addTeacher(t1);

        Course fizik=new Course("fizik","102","fzk");
        fizik.addTeacher(t2);

        Course kimya=new Course("fizik","102","fzk");
        kimya.addTeacher(t3);

        Student s1=new Student("inek şaban","123","84",tarih,fizik,kimya);
        s1.addBulExamNote(100,100,10);
        s1.printNote();




    }
}