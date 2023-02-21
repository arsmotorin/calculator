import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        float one = scan.nextFloat();

        System.out.print("Second number: ");
        float two = scan.nextFloat();

        float res_one = one + two;
        float res_two = one - two;
        float res_three = one * two;
        float res_four = one / two;
        int res_five = (int) Math.sqrt(one);
        int res_six = (int) Math.sqrt(two);

        System.out.println("+ " + res_one + "\n- " + res_two + "\n* " + res_three + "\n/ " + res_four +
                "\nsqrt first number " + res_five + "\nsqrt second number " + res_six);
    }
}