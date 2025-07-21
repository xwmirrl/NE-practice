import java.util.Scanner;

public class RoundDivide {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = in.nextInt();
        int result = (int) Math.ceil(a / b);
        System.out.println(result);
    }

}
