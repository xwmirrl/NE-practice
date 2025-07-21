public class default1 {

    public static void main(String[] args) {

        Book salam = new Book();
        Book chotam = new Book("Little Prince", "hz");
        Book joker = new Book("Crime and Punishment", "Dostoyevsky", 8);

        salam.displayInfo();
        chotam.displayInfo();
        joker.displayInfo();
    }
}

class Book {
    String title;
    String author;
    double price;

    Book() {
        this("Undefined", "Unknown", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.printf("Book title: %s, book author: %s, price: %f", title, author, price);
        System.out.println();
    }
}