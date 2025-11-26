package ecUtbildningTomas.W3Damir;

public class Student {
    // Attribut till namn och årskurs
    private String name;
    private int grade;

    // Konstruktör
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Metod
    public void promote() {
        grade++;
    }

    public String getStage() {
        if (grade >= 1 && grade <= 3) {
            return "Lågstadiet";
        } else if (grade >= 4 && grade <= 6) {
            return "Mellanstadiet";
        } else if (grade >= 7 && grade <= 9) {
            return "Högstadiet";
        } else {
            return "Gymnasiet"; // grade >=10
        }

    }
    // Getter för grade
    public int getGrade () {
        return grade;

    }
}


//15. 	Skapa en klass Student:
//Konstruktorn ska ta in namn och årskurs.
//Skapa en metod promote som ökar årskursen med 1.
// Skapa en metod som skriver ut vilket stadie man går på (Lågstadiet, mellanstadiet osv.)
// Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden.
// Skriv ut årskurs och stadie ifrån mainmetoden.