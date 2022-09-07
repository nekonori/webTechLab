class Circle{
    int radius;
    Circle(int r){
        radius = r;
    }
    double perimeter(){
        return Math.PI * 2 * radius;
    }
}

class Square{
    int side;
    Square(int s){
        side = s;
    }
    int perimeter(){
        return 4 * side;
    }
}

class Rect{
    int l, b;
    Rect(int l, int b){
        this.l = l;
        this.b = b;
    }
    int perimeter(){
        return 2 * (l + b);
    }
}
        
public class Perimeter {
    public static void main(String[] args){
        Circle c = new Circle(10);
        Square s = new Square(5);
        Rect r = new Rect(4,5);
        System.out.println("Perimeter\nCircle: "+c.perimeter() + "\nSquare: " + s.perimeter()+"\nRect: "+ r.perimeter());
    }
}
