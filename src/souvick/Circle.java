package souvick;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.142, area, perimeter;

        double radius = 12.0;

        area = pi * radius * radius ;
        perimeter = 2 * pi * radius ;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
