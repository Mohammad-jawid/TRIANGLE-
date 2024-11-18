package traingle;

import java.util.Scanner;

public class Traingle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3;   //coordinates
        double a, b, c;               // sides
        double A, B, C;           // Angles

        System.out.println("Enter the first point: ");
        System.out.print("x1: ");
        x1 = input.nextInt();
        System.out.print("y1: ");
        y1 = input.nextInt();

        System.out.println("Enter the second point: ");
        System.out.print("x2: ");
        x2 = input.nextInt();
        System.out.print("y2: ");
        y2 = input.nextInt();

        System.out.println("Enter the third point: ");
        System.out.print("x3: ");
        x3 = input.nextInt();
        System.out.print("y3: ");
        y3 = input.nextInt();

        a = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
        System.out.println("a : " + a);
        b = Math.sqrt((Math.pow((x1 - x3), 2)) + (Math.pow((y1 - y3), 2)));
        System.out.println("b : " + b);
        c = Math.sqrt((Math.pow((x2 - x3), 2)) + (Math.pow((y2 - y3), 2)));
        System.out.println("c : " + c);

        A = Math.toDegrees(Math.acos((c * c + b * b - a * a) / (-2 * b * c)));
        B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (-2 * a * c)));
        C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (-2 * b * a)));

        A = Math.round(A);
        B = Math.round(B);
        C = Math.round(C);

        System.out.println("A  = " + A);
        System.out.println("B  = " + B);
        System.out.println("C  = " + C);
    }

}
