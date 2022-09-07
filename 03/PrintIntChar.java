public class PrintIntChar {
    static void print(int i, char c){
        System.out.println(i + ", " + c);
    }
    static void print(char c, int i){
        System.out.println(i + ", " + c);
    }
    public static void main(String[] args){
        print(1, 'c');
        print('b', 2);
    }
}
