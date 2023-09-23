package souvick;
import java.util.Scanner;
class Addition{
    int x,y,sum;
    public Addition(int m, int n){
        x=m;
        y=n;
    }
    void result(){
    sum=x+y;
    System.out.println("Sum of "+x+" and "+y+" = "+sum);
    }
}
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Addition a1=new Addition(a,b);
        a1.result();
    }
}
