package MyPackage;

public class Book {

    public int id, quantity;
    public String name, author, desc, publisher;
    public double price;

    public Book(int id, String name, String desc, String pub, String author, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.publisher = pub;
        this.author = author;
        this.price = price;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
}

