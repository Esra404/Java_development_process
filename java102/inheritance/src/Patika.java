public class Patika {
    public static void main(String[] args) {

        Calisan c1=new Calisan("esra","218371238","jksdn");
        Akademisyen a1=new Akademisyen("derya","jskd","sjdcn","ceng","doç" );
        Memur m1=new Memur(" ali  ","125151","dwgy","qwjs","ndwkj");
        OgretimGorevlisi o1=new OgretimGorevlisi("ads","dsad","dfs","dfws","fds");
        m1.calis();
        a1.cikis();
        a1.derseGir();
        o1.giris();
        Asistan as1=new Asistan("necmi","123","saaö@dsl","ceng","doç","12:00");
        as1.QuizYap();
        LabAsistan l1=new LabAsistan("hayri","13123","sxa@","ceng","doç","1200");
        l1.derseGir();
    }
}
