import java.util.Scanner;
class PrintPat5{
int n;
public PrintPat5(int x){
n=x;
}
void print(){
char k=65;
for(int i=1;i<=n;i++){
for(int j=n-i+1;j>=1;j--){
System.out.print(k+" ");
k+=2;
}
System.out.println();
}
}
}
public class Pattern5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();

PrintPat5 pat=new PrintPat5(n);
pat.print();
}
}