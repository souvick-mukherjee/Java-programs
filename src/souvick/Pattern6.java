import java.util.Scanner;
class PrintPat6{
int n;
public PrintPat6(int x){
n=x;
}
void print(){
for(int i=1;i<=n;i++){
for(int j=1;j<i;j++){
System.out.print(" ");
}
int k=1;
for(int j=n-i+1;j>=1;j--){
System.out.print(k);
k++;
}
for(int j=n-i;j>=1;j--){
System.out.print(j);
}
System.out.println();
}
}
}
public class Pattern6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();
PrintPat6 pat=new PrintPat6(n);
pat.print();
}
}