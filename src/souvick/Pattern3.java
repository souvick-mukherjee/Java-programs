import java.util.Scanner;
class PrintPat3{
int n;
public PrintPat3(int x){
n=x;
}
void print(){

for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if((i+j)%2==0)
System.out.print(0+" ");
else
System.out.print(1+" ");

}
System.out.println();
}
}
}
public class Pattern3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();

PrintPat3 pat=new PrintPat3(n);
pat.print();
}
}