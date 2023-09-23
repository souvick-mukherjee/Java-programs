package souvick;
import java.util.Scanner;
class PrintPat7{
    int n;
    public PrintPat7(int x){
        n=x;
    }
    void print(){
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1 && j==1)
                    System.out.print(b+" ");
                else {
                    c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }
    }
}
public class Pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height: ");
        int n=sc.nextInt();

        PrintPat7 pat=new PrintPat7(n);
        pat.print();
    }
}
