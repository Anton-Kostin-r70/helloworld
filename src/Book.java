import java.util.Objects;

public class Book {
    public Book(String aTitle, Author aAuthor, int aYear) {
        setTitle(aTitle);
        setAuthor(aAuthor);
        setPublicationYear(aYear);
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

    public void setAuthor(Author aAuthor) throws RuntimeException {
        if (aAuthor != null) {
            author = new Author(aAuthor);
        } else {
            throw new RuntimeException("Не указан автор");
        }
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int aYear) {
        publicationYear = aYear;
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

    private String title = "";
    private Author author = null;
    private int publicationYear = 0;
}
