class Book {
    String name, publisher;
    int publishedYear, price, edition;

    int getPrice() {
        System.out.print("Executing from parent class");
        return price;
    }
}

class TechnicalBook extends Book {
    int getPrice() {
        System.out.print("Executing from child class ");
        return price;
    }

    TechnicalBook(String n, int p) {
        name = n;
        price = p;
    }
}

class NonTechnicalBook extends Book {
    int getPrice() {
        System.out.println("Executing from child class");
        return price;
    }
    NonTechnicalBook(String n, int p){
        name = n;
        price = p;
    }
}

public class OnlineBookClass {
    public static void main(String[] args) {
        // downcasting throws exception
        // TechnicalBook techBook = (TechnicalBook) new Book();
        Book tb = new TechnicalBook("Newtons laws of motion", 300);
        System.out.println(tb.getPrice());
    }
}
