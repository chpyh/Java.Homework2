package Семинары.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Book<String> book1 = new Book<>("Сказка о царе Салтане");
        Book<String> book2 = new Book<>("Темные дыры и вселенная");
        Book<Integer> book3 = new Book<>(1247689);
        Book<Integer> book4 = new Book<>(1247890);
        Book<Integer> book5 = new Book<>(124670);
        List<Book> bookList = new ArrayList<>(List.of(book1, book2, book3));
        List<Book> outList = new ArrayList<>();
        Library library = new Library<>(bookList, outList);
       
        //добавляем новые книжки в библиотеку
        library.addOrReturnBook(book4);
        library.addOrReturnBook(book5);

        // закомментила, потому что по условию не требуется
        // library.printInBooks();
        // System.out.println();

        library.outBook(book3);
        library.outBook(book2);
        library.outBook(book4);

        library.printOutBooks();
        //System.out.println();

        //library.printInBooks();

        

        
    }
}
