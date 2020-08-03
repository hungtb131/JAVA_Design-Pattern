package TH_DesignPattern.TH_Sigleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author="Gamma,Helm,Johnon, and CLissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    //method mượn sách
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    //method trả sách
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthorAndTitle(){
        return getTitle()+"by"+getAuthor();
    }


}
