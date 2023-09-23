package souvick;
import java.util.Scanner;

class PrintPat8{
    int n;
    public PrintPat8(int x){
        n=x;
    }

    boolean checkPrime(int k) {
        int isPrime=1;
        for(int i=2;i<k;i++) {
            if(k%i==0)
                isPrime=0;
        }
        if(isPrime==1)
            return true;
        else
            return  false;
    }


    void print() {
        int counter = 2;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                while (!checkPrime(counter)) {
                    counter++;
                }
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
public class Pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height: ");
        int n=sc.nextInt();

        PrintPat8 pat=new PrintPat8(n);
        pat.print();
    }
}
