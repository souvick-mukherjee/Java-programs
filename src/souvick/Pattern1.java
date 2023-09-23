import java.util.Scanner;
class PrintPat1{
int n;
public PrintPat1(int x){
n=x;
}
void print(){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}

public class Pattern1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter height: ");
int n=sc.nextInt();

PrintPat1 p1=new PrintPat1(n);
p1.print();
}
}