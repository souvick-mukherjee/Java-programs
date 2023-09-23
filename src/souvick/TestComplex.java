package souvick;

import java.util.Scanner;

class Complex{
    int real, img;
    void getComplex(int a,int b){
        real=a;
        img=b;
    }
    void showComplex(){
        if(img>=0)
            System.out.println(real+"+"+img+"i");
        else
            System.out.println(real+""+img+"i");
    }
    Complex addComplex(Complex c){
        Complex d=new Complex();
        d.real=this.real+c.real;
        d.img=this.img+c.img;
        return d;
    }
}
public class TestComplex {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex p=new Complex();
        Complex q=new Complex();
        System.out.println("Enter real and imaginary part of 1st complex no.");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        p.getComplex(r1,i1);
        System.out.println("1st complex no.:");
        p.showComplex();
        System.out.println("Enter real and imaginary part of 2nd complex no.");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        q.getComplex(r2,i2);
        System.out.println("2nd complex no.:");
        q.showComplex();
        Complex r=p.addComplex(q);
        System.out.println("Sum of the 2 complex nos.");
        r.showComplex();
    }
}
