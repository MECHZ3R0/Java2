package accessmodifiers;

public class Library {
    private String bookTitle;
    private String bookAuthor;
    private int ISBN;
    private int numberOfPages;
    private boolean availability;
    private String borrowDate;
    private String returnDate;

    public Library(String bookTitle, String bookAuthor, int ISBN, int numberOfPages, boolean availability, String borrowDate, String returnDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.availability = availability;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void newBorrowDate(String borrowDate){
        if (this.availability){
            this.availability=false;
        }
        else {
            System.out.println("This book is not available.");
        }
        String [] arr = borrowDate.split("/");
        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);
        if (month>=1&&month<=12&&day>=1&&day<=31){
            this.borrowDate=borrowDate;
        }
        else{
            System.out.println("Date is incorrect.");
        }

    }

    public void newReturnDate(String returnDate){
        this.availability=true;
        String [] arr = returnDate.split("/");
        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);
        if (month>=1&&month<=12&&day>=1&&day<=31){
            this.returnDate=returnDate;
        }
        else{
            System.out.println("Date is incorrect.");
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN=" + ISBN +
                ", numberOfPages=" + numberOfPages +
                ", availability=" + availability +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
