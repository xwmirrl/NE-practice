package homework;

import java.util.Scanner;

public class ArrayMaxProgram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] b = in.nextLine().split(" ");
        int[] a = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            a[i] = Integer.parseInt(b[i]);
        }
        System.out.println(arrayMax(a));

    }

    public static int arrayMax(int[] arr){

        boolean flag;
        for (int val : arr) {
            flag = true;
            for (int i : arr) {
                if (val < i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return val;
            }
        }

        return 0;
    }
}