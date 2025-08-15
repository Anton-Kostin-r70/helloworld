import java.util.Objects;

public class Author {
    public Author(String aFirstName, String aLastName) {
        setFirstName(aFirstName);
        setLastName(aLastName);
    }

    public Author(Author aAuthor) {
        this(aAuthor.getFirstName(), aAuthor.getLastName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    private String firstName = "";
    private String lastName = "";

}
