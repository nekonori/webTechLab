class ComplexNo{
    int real, img;
    ComplexNo(int real, int img){
        this.real = real;
        this.img = img;
    }
    public void add(int real, int img){
        this.real += real;
        this.img += img;
    }
    public void sub(int real, int img){
        this.real -= real;
        this.img -= img;
    }
    public void display(){
        System.out.println(real + " + " + img + "i");
    }
}
public class Complex {
    public static void main(String[] args) {
        ComplexNo c = new ComplexNo(12, 24);
        c.display();
        System.out.println("Add 12 + 7i");
        c.add(12, 7);
        c.display();
        System.out.println("Sub 1 + 0i");
        c.sub(1, 0);
        c.display();
    }
}
