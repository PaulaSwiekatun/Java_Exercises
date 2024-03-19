public class ExStudent {
    public static void main(String[] args) {

        String university = Student.universityName;
        Student.infoUniversity();   // Methods static

        Student tosia = new Student();  //Debug
        tosia.firstName = "Tosia";
        tosia.name = "Antonina";
        tosia.indexNumber = 123123;
        tosia.email = "antonina.tosia@gmail.com";
        tosia.nick = "TosiaA";
        String universityTosia = tosia.universityName;

        Student kuba = new Student();  //Debug
        kuba.firstName = "Kuba";
        kuba.name = "Jakub";
        kuba.indexNumber = 888431;
        kuba.email = "kuba.jakub@gmail.com";
        kuba.nick = "KubaJ";
        String universityKuba = kuba.universityName;

        Student kamela = new Student();   //Debug
        kamela.firstName = "Kamela";
        kamela.name = "Kam";
        kamela.indexNumber = 998545;
        kamela.email = "kamela.kam@gmail.com";
        kamela.nick = "KamelaK";
        String universityKamelka = kamela.universityName;

        Student[] students = new Student[3];
        students[0] = tosia;
        students[1] = kuba;
        students[2] = kamela;

        for (int i = 0; i < students.length; i++) {

            students[i].introduceYourSelf();
            students[i].enterEmail();
            students[i].specifyIndexNumber();
            students[i].logIn();
        }
    }
}
