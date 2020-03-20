package accessmodifiers;

public class LibraryTest{
    public static void main(String[] args) {
        Library book = new Library("Harry Potter","Rowling", 123456, 700,true,"","");
        System.out.println(book.toString());
        book.newBorrowDate("03/10/2020");
        System.out.println(book.getBorrowDate());
        System.out.println(book.isAvailability());
        book.newBorrowDate("03/11/2020");
        book.newReturnDate("03/11/2020");
        System.out.println(book.getReturnDate());
        System.out.println(book.isAvailability());
    }
}