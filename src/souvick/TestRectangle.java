package souvick;

import java.util.Scanner;

class Point{
    int x,y;
    public Point(int x_coo,int y_coo){
        x=x_coo;
        y=y_coo;
    }
    void showPoint()
    {
        System.out.println("("+x+","+y+")");
    }

}
class Rectangle{
    int width,height;
    Point origin;
    public Rectangle(int w,int h,int x,int y){
        width=w;
        height=h;
        origin=new Point(x,y);
    }
    public Rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of origin:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        origin=new Point(x,y);
        System.out.println("Enter width and height:");
        width= sc.nextInt();
        height= sc.nextInt();
    }
    void move(int p, int q){
        origin.x=p;
        origin.y=q;
    }
    int area(){
        return width*height;
    }
    int perimeter(){
        return 2*(width+height);
    }
    void showRectangle(){
        System.out.print("Point of origin:");
        origin.showPoint();
        System.out.println("Width:"+width+" "+"Height: "+height);
        System.out.println("Area: "+area());
        System.out.println("Perimeter: "+perimeter());
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter origin: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Enter width and height: ");
        int w=sc.nextInt();
        int h=sc.nextInt();
        Rectangle rect1=new Rectangle(w,h,x,y);
        rect1.showRectangle();
        System.out.println("Enter new coordinates:");
        int w2= sc.nextInt();
        int h2=sc.nextInt();
        rect1.move(w2,h2);
        rect1.showRectangle();
    }
}
