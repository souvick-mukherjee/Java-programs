package souvick;
import java.util.Scanner;
class Item{
    Scanner sc=new Scanner(System.in);
    int code,price;
    static int[] codeList=new int[10];
    static int[] priceList=new int[10];
    static int item_no=0,total=0;
    public Item(){
        System.out.println("Enter item code and price for item "+(item_no+1)+": ");
        code=sc.nextInt();
        price=sc.nextInt();
        codeList[item_no]=code;
        priceList[item_no]=price;
        item_no++;
        total+=price;
    }
    void display(){
        System.out.println("Item code: "+code+"\t Price: "+price);
    }
}
public class TestItems {
    public static void main(String[] args) {
        Item i1=new Item();
        Item i2=new Item();
        Item i3=new Item();
        Item i4=new Item();
        Item i5=new Item();
        Item i6=new Item();
        Item i7=new Item();
        Item i8=new Item();
        Item i9=new Item();
        Item i10=new Item();

        i1.display();
        i2.display();
        i3.display();
        i4.display();
        i5.display();
        i6.display();
        i7.display();
        i8.display();
        i9.display();
        i10.display();

        int max=Item.priceList[0],max_index=0,min=Item.priceList[0],min_index=0;

        for(int i=0;i<Item.priceList.length;i++){
            if(Item.priceList[i]>=max){
                max=Item.priceList[i];
                max_index=i;
            }
            else if(Item.priceList[i]<min){
                min=Item.priceList[i];
                min_index=i;
            }
        }
        System.out.println("Total: "+Item.total);
        System.out.println("Code of maximum priced item: "+Item.codeList[max_index]);
        System.out.println("Code of minimum priced item: "+Item.codeList[min_index]);
        System.out.println(max+"  "+max_index);
        System.out.println(min+"  "+min_index);

    }
}
