package souvick;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
        System.out.println(a+"   "+b);
    }

    static void swap(int n1, int n2) {
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1+"   "+n2);
    }
}
