package souvick;
import java.util.Scanner;
class SquareSeries{
    int x,sum=0;
    public SquareSeries(int m){
        x=m;
    }
    int seriesSum(){
        int k;
        for(int i=1;i<=x;i+=2){
            k=2*i-1;
            sum+=k*k;
        }
        return  sum;
    }
    void print(){
        System.out.println("Sum of "+x+" terms is: "+seriesSum());
    }
}
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n=sc.nextInt();
        SquareSeries sq=new SquareSeries(n);
        sq.print();
    }
}
