package souvick;
import  java.util.Scanner;

class FiboSeries
{
    int x;
    public FiboSeries(int m){
        x=m;
    }
    void printTerms(){
        int a=0,b=1,c;
        System.out.print("Fibonacci series of "+x+" terms: "+a+" "+b+" ");
        for(int i=2;i<x;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms:");
        int n=sc.nextInt();
        FiboSeries f=new FiboSeries(n);
        f.printTerms();
    }
}
