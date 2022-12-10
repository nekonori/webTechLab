package MyPackage;

public class SaladIngredient {
    String name;
    int price;
    public SaladIngredient(String n, int p){
        name = n;
        price = p;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
