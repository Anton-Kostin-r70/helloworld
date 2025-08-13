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

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    private String firstName = "";
    private String lastName = "";

}
