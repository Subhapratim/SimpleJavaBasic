package JAXB.Tester;

import JAXB.Model.Book;
import JAXB.Model.BookStore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookMain {

    private static final String BOOKSTORE_XML = "src/Resources/bookstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {
        ArrayList<Book> books = new ArrayList<Book>();

        // create books
        Book book1 = new Book();
        book1.setIsbn("978-0060554736");
        book1.setName("The Game");
        book1.setAuthor("Neil Strauss");
        book1.setPublisher("Harpercollins");
        books.add(book1);

        Book book2 = new Book();
        book2.setIsbn("978-3832180577");
        book2.setName("Feuchtgebiete");
        book2.setAuthor("Charlotte Roche");
        book2.setPublisher("Dumont Buchverlag");
        books.add(book2);

        // create bookstore, assigning book
        BookStore bookStore = new BookStore();
        bookStore.setName("Fraport Bookstore");
        bookStore.setLocation("Frankfurt Airport");
        bookStore.setBookList(books);

        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(BookStore.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        marshaller.marshal(bookStore, System.out);

        // Write to File
        marshaller.marshal(bookStore, new File(BOOKSTORE_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");

        Unmarshaller umUnmarshaller = context.createUnmarshaller();
        BookStore bookstore2 = (BookStore) umUnmarshaller.unmarshal(new FileReader(BOOKSTORE_XML));

        ArrayList<Book> list = bookstore2.getBooksList();
        for (Book book : list) {
            System.out.println("Book: " + book.getName().toUpperCase() + " of " + book.getAuthor().toUpperCase() + " from " + bookstore2.getName().toUpperCase() + " in " + bookstore2.getLocation().toUpperCase());
        }
    }

}
