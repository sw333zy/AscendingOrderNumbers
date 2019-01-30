import java.util.Scanner;

public class AscendingOrderNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a letter");
        String a = keyboard.next();
        System.out.println("Enter a letter");
        String b = keyboard.next();
        System.out.println("Enter a letter");
        String c = keyboard.next();

        String orderStr = a;

        if (a.compareTo(b) > 0 && b.compareTo(c) > 0 && a.compareTo(c) > 0)
            orderStr = c + " " + b + " " + a;
        else if
        (a.compareTo(b) > 0 && a.compareTo(c) > 0 && c.compareTo(b) > 0)
            orderStr = b + " " + c + " " + a;
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0 && a.compareTo(c) > 0)
            orderStr = c + " " + a + " " + b;
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0 && c.compareTo(a) > 0)
            orderStr = a + " " + c + " " + b;
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0 && b.compareTo(a) > 0)
            orderStr = a + " " + b + " " + c;
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0 && a.compareTo(c) > 0)
            orderStr = b + " " + a + " " + c;

        System.out.println("The correct order is " + orderStr);

    }
}