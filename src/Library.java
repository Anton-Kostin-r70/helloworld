public class Library {
    public static void main(String[] args) {
        Author a = new Author("Дональд", "Кнут");
        Author b = new Author("Бьёрн", "Страуструп");
        Book book1 = new Book("The Art of Computer Programming", a, 1968);
        Book book2 = new Book("The C++ Programming Language", b, 1997);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublicationYear(2025);
        System.out.println(book1);
    }
}
