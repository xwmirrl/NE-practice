public class BookCatalog {

    public static void main(String[] args) {

        Publication[] books = {new Book("To Kill a Mockingbird", 1960, "Harper Lee"), new Book("Harry Potter and the Philosopher’s Stone", 1997, "J. K. Rowling"), new Book("The Road", 2006, "Cormac McCarthy")};
        for (Publication book : books) {
            book.getInfo();
        }
        for (Publication book : books) {
            if (((ClassicCheckable) book).isClassic()) {
                System.out.println(book.getTitle() + " - классика");
            }
        }

    }

}

abstract class Publication {

    protected String title;
    protected int year;

    Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    String getTitle() {
        return title;
    }

    int getYear() {
        return year;
    }

    abstract void getInfo();

}

interface ClassicCheckable {
    boolean isClassic();
}

class Book extends Publication implements ClassicCheckable {

    String author;

    Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    void getInfo() {
        System.out.printf("Книга: %s, Автор: %s, Год: %d\n", title, author, year);
    }

    public boolean isClassic() {
        return year < 1975;
    }

}
