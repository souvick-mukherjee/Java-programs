import java.util.Scanner;
class PrintPat2{
int n;
public PrintPat2(int x){
n=x;
}
void print(){
int k=0;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if(k%2==0)
System.out.print(1+" ");
else
System.out.print(0+" ");
k++;
}
System.out.println();
}
}
}
public class Pattern2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();

PrintPat2 pat=new PrintPat2(n);
pat.print();
}
}