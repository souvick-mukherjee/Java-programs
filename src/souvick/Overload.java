package souvick;
class ConstOvld{
    int x;
    ConstOvld(int i){
        System.out.println("Inside ConstOvld(int)");
        x = i;
    }
    ConstOvld(double d){
        System.out.println("Inside ConstOvld(double)");
        x = (int)d;
    }
    ConstOvld(int i, int j){
        System.out.println("Inside ConstOvld(int,int)");
        x = i * j;
    }
}
public class Overload {
    public static void main(String[] args) {
        ConstOvld t1=new ConstOvld(88);
        ConstOvld t2=new ConstOvld(17.56);
        ConstOvld t3=new ConstOvld(12,4);

        System.out.println("t1.x = "+ t1.x);
        System.out.println("t2.x = "+ t2.x);
        System.out.println("t3.x = "+ t3.x);
    }
}