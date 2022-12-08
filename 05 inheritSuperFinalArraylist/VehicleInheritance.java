class Vehicle{
    String color;
}

class TwoWheeler extends Vehicle{
    TwoWheeler(){
        color = "green";
    }
    void display(){
        System.out.println("This is a " + color + " two wheeler");
    }
}

class ThreeWheeler extends Vehicle{
    ThreeWheeler(){
        color = "red";
    }
    void display(){
        System.out.println("This is a " + color + " three wheeler");
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(){
        color = "blue";
    }
    void display(){
        System.out.println("This is a " + color + " four wheeler");
    }
}

public class VehicleInheritance {
    public static void main(String[] args){            
        TwoWheeler tw = new TwoWheeler();
        tw.display();
        ThreeWheeler th = new ThreeWheeler();
        th.display();
        FourWheeler f = new FourWheeler();
        f.display();
    }
}
