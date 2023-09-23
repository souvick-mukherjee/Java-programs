package souvick;

import java.util.Scanner;

class MotorVehicle{
    String modelName,modelNumber;
    double modelPrice;
    public  MotorVehicle(String nm,String no,double p){
        modelName=nm;
        modelNumber=no;
        modelPrice=p;
    }
}
class Car extends MotorVehicle{
    double discountRate;
    public Car(String name,String  num, double prc, double disc){
        super(name,num,prc);
        discountRate=disc;
    }
    double discount(){
        double discountAmt=modelPrice*discountRate/100;
        return modelPrice-discountAmt;
    }
    void display(){
        System.out.println("Car Name: "+modelName+"\n"+"Model number: "+modelNumber+"\n"+"Price: "+modelPrice+"\n"+"Discount rate: "+discountRate+"\n"+"Final Price: "+discount());
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Car name: ");
        String carName= sc.nextLine();
        System.out.println("Enter model no.: ");
        String modelNo=sc.nextLine();
        System.out.println("Enter price: ");
        double price= sc.nextDouble();
        System.out.println("Enter discount rate: ");
        double discRate=sc.nextDouble();
        Car c1=new Car(carName,modelNo,price,discRate);
        c1.display();
    }
}
