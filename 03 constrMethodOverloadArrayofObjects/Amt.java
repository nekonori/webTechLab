class AddAmount{
    static int amount = 500;
    AddAmount(){}
    AddAmount(int x){
        amount += x;
    }
}
public class Amt {
    public static void main(String[] args){            
        AddAmount a = new AddAmount();
        System.out.println("Calling default constr: " + a.amount);        
        AddAmount b = new AddAmount(400);
        System.out.println("Calling parameterized  constr: " + a.amount);
    }
}
