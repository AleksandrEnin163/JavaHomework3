import java.util.Scanner;

public class Homework3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Print Radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of a circle with radius " + radius + ": " + area);
    }
}
