import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding sample data
        library.addBook(new Book("Java Basics", "James Gosling", 101));
        library.addBook(new Book("OOP Concepts", "Grady Booch", 102));

        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        while (true) {
            System.out.println("\n1. Display Books\n2. Display Users\n3. Issue Book\n4. Return Book\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    library.issueBook(bookId, userId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    bookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    userId = sc.nextInt();
                    library.returnBook(bookId, userId);
                    break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}