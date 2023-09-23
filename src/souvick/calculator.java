package souvick;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter operator: ");
            char op= in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter 2 numbers: ");
                int a= in.nextInt();
                int b= in.nextInt();

                if(op=='+')
                    ans=a+b;
                if(op=='-')
                    ans=a-b;
                if(op=='*')
                    ans=a*b;
                if(op=='/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if(op=='%')
                    ans=a%b;
                System.out.println(ans);
            } else if (op=='x'|| op=='X') {
                break;
            }else {
                System.out.println("Invalid operation!!");
            }

        }
    }
}
