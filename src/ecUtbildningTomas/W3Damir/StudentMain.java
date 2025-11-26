package ecUtbildningTomas.W3Damir;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student("Alex", 7);
        stu1.promote();

        System.out.println("Årskurs: " + stu1.getGrade() + ", Stadie: " + stu1.getStage() );
    }
}
//15. 	Skapa en klass Student:
//Konstruktorn ska ta in namn och årskurs.
//Skapa en metod promote som ökar årskursen med 1.
// Skapa en metod som skriver ut vilket stadie man går på (Lågstadiet, mellanstadiet osv.)
// Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden.
// Skriv ut årskurs och stadie ifrån mainmetoden.