package w1MyExercise;

public class Book {
    private final String  title;
    private final String author;
    private final int pages;

    public Book (String title, String author, int page){
        this.title=title;
        this.author=author;
        this.pages=page;
    }

    public void getSummary() {
        System.out.println("Tittle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
     boolean isLongBook() {
         return pages > 300;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

