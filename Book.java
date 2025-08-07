public class Book {
    private String title;
    private String author;
    private int id;
    private boolean isIssued;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isIssued = false;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    @Override
    public String toString() {
        return id + ": " + title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
    }

    public int getId() {
        return id;
    }
}