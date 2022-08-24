
import java.util.*;

class Book {

    int id;
    String name;
    boolean isBorrowed;

    Book(int bookId, String bookName) {
        id = bookId;
        name = bookName;
    }

    public void borrow() {
        isBorrowed = true;
    }
}

public class LibraryBooks {

    static ArrayList<Book> books;
    static Scanner sc = new Scanner(System.in);
    static int counter;

    static void printMenu() {
        System.out.println("1 -> Insert\n2 -> Borrow\n3 -> Display\n-1 -> exit");
    }

    static void insert() {
        System.out.print("Enter book name: ");
        sc.nextLine();
        String bookName = sc.nextLine();
        books.add(new Book(counter++, bookName));
    }
    
    static void display(){
        for(int i=0;i<books.size();i++){
            System.out.println("Book id: " + books.get(i).id);
            System.out.println("Book name: " + books.get(i).name);
            System.out.println("Borrowed: " + books.get(i).isBorrowed);
            System.out.println();
        }
    }
    
    static void borrow(){
        System.out.print("Enter id of book to borrow:");
        int bookId = sc.nextInt(), indexToBorrow = -1;
        for(int i=0;i<books.size();i++){
            if(books.get(i).id == bookId){
                indexToBorrow = i;
            }
        }
        if(indexToBorrow != -1)
            books.get(indexToBorrow).isBorrowed = true;
    }

    public static void main(String[] args) {
        counter = 0;
        books = new ArrayList<>();
        int choice = 0;
        while (choice != -1) {
            printMenu();
            System.out.print(">>");
            choice = sc.nextInt();
            if (choice == -1) {
                return;
            }
            if (choice == 1) 
                insert(); 
            else if(choice == 2)
                borrow();
            else if(choice == 3)
                display();
        }
    }
}
