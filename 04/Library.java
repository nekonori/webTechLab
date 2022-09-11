import java.util.*;

public class Library {
    static {
        System.out.println("Static block executed");
    }
    static List<String> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void add(){
        System.out.print("Enter book name: ");
        books.add(sc.next());
    }

    static void remove(){
        System.out.print("Enter book name: ");
        books.remove(sc.next());
    }

    static void display(){
        System.out.println(Arrays.toString(books.toArray()));
    }

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("1->add, 2->remove, 3->display -1->exit");
        while (choice != -1){
            System.out.print(">>");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> add();
                case 2 -> remove();
                case 3 -> display();
            }
        }
    }
}
