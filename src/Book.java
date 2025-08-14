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

    public String toString() {
        return "\"" + getTitle() + "\", " + "автор: " + getAuthor() + ", год изд. " +  getPublicationYear();
    }
    private String title = "";
    private Author author = null;
    private int publicationYear = 0;
}
