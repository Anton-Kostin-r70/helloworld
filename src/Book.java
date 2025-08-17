import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int year) {
        setTitle(title);
        setAuthor(author);
        setPublicationYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) throws RuntimeException {
        if (author != null) {
            this.author = new Author(author);
        } else {
            throw new RuntimeException("Не указан автор");
        }
    }

    public int getPublicationYear() {

        return publicationYear;
    }

    public void setPublicationYear(int year) {

        publicationYear = year;
    }

    @Override
    public String toString() {
        return "\"" + getTitle() + "\", " + "автор: " + getAuthor() + ", год изд. " + getPublicationYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
