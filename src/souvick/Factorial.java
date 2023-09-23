package souvick;
import java.util.Scanner;
class FindFact{
    int x;
    public FindFact(int m){
        x=m;
    }
    int factorial(int fact)
    {
        if(fact<=1)
            return 1;
        else
            return fact*factorial(fact-1);
    }
    void result(){
        System.out.println("Factorial of "+x+" is : "+factorial(x));
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        FindFact f=new FindFact(a);
        f.result();
    }
}
