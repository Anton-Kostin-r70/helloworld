import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        if (firstName == null && lastName == null)
            throw new IllegalArgumentException("Фамилия и имя не внесены");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(Author author) {

        this(author.getFirstName(), author.getLastName());
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    
    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
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

}
