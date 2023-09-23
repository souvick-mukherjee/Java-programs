package souvick;
import java.util.Scanner;
class FindPrime
{
    int x;
    public FindPrime(int m){
        x=m;
    }
    void check(){
        int c=0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                c++;
            }
        }
        if(c>0){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
    }
}
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        FindPrime f1=new FindPrime(a);
        f1.check();
    }
}
