package souvick;

import java.util.Scanner;

class DeptStore{
    int[][] sales =new int[4][5];
    int deptSales, storeSales;
    void recordSales(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales for each dept of each shop: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                sales[i][j]= sc.nextInt();
            }
        }
    }
    void showStoreSales(){
        System.out.println("Sales of each store: ");
        for(int i=0;i<4;i++){
            storeSales=0;
            for(int j=0;j<5;j++){
                storeSales+=sales[i][j];
            }
            System.out.println("Sales of store "+(i+1)+": "+storeSales);
        }
    }
    void showDeptSales(){
        System.out.println("Sales of a particular dept of all stores: ");
        for(int j=0;j<5;j++){
            deptSales=0;
            for(int i=0;i<4;i++){
                deptSales+=sales[i][j];
            }
            System.out.println("Sale of dept "+(j+1)+": "+deptSales);
        }
    }
}
public class TestShop {
    public static void main(String[] args) {
        DeptStore ds=new DeptStore();
        ds.recordSales();
        ds.showDeptSales();
        ds.showStoreSales();
    }
}
