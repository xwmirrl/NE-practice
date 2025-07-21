import java.util.Scanner;

public class WholeFraction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int whole = (int) a;
        double fraction = a % 1;
        System.out.printf("Whole part: %d \nFractional part: %f", whole, fraction);
    }
}
