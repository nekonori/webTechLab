public class Volume {
    static int vol(int s){
        return (int)Math.pow(s,3);
    }
    static double vol(int r, int h){
        return Math.PI * r * r * h;
    }
    static double vol(double r){
        return 4/3*Math.PI*Math.pow(r,3);
    }
    public static void main(String[] args){
        System.out.println("Vol of cube with side 5: " + vol(5));
        System.out.println("Vol of cylinder with r=2, h=4: " + vol(2,4));
        System.out.println("Vol of sphere with r=5: " + vol(5.0D));
    }
}
