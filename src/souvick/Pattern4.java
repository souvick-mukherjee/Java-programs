import java.util.Scanner;
class PrintPat4{
int n;
public PrintPat4(int x){
n=x;
}
void print(){

for(int i=1;i<=n;i++){
for(int j=n-i+1;j>=1;j--){
System.out.print(j+" ");

}
System.out.println();
}
}
}
public class Pattern4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();

PrintPat4 pat=new PrintPat4(n);
pat.print();
}
}