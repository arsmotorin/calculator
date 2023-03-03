import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        short num1 = sc.nextShort();
        System.out.print("Enter 2nd number: ");
        short num2 = sc.nextShort();
        plus(num1, num2);
        minus(num1, num2);
        delenie(num1, num2);
        umn(num1,num2);
    }

    public static void plus(short num1, short num2) {
        int res = num1 + num2;
        System.out.println("Result +: " + res);
    }

    public static void minus(short num1, short num2) {
        int res = num1 - num2;
        System.out.println("Result -: " + res);
    }

    public static void umn(short num1, short num2) {
        int res = num1 * num2;
        System.out.println("Result *: " + res);
    }
    public static void delenie(short num1, short num2) {
        int res = num1 / num2;
        System.out.println("Result /: " + res);
    } 
}
