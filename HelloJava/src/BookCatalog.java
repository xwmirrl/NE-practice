public class BookCatalog {

    public static void main(String[] args) {

        Publication[] books = {new Book("To Kill a Mockingbird", 1960, "Harper Lee"), new Book("Harry Potter and the Philosopher’s Stone", 1997, "J. K. Rowling"), new Book("The Road", 2006, "Cormac McCarthy")};
        for (Publication book : books) {
            System.out.println(book.getInfo());
        }
        for (Publication book : books) {
            if (((ClassicCheckable) book).isClassic()) {
                System.out.println(book.getTitle() + " - классика");
            }
        }

    }

}

abstract class Publication {

    private String title;
    private int year;

    Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    abstract public String getInfo();

}

interface ClassicCheckable {
    boolean isClassic();
}

class Book extends Publication implements ClassicCheckable {

    private String author;

    Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Книга: " + getTitle() + ", год выхода: " + getYear() + ", автор: " + author;
    }

    public boolean isClassic() {
        return getYear() < 1975;
    }

}
