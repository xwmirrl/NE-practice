    import java.util.Arrays;
    import java.util.Scanner;

    public class FrequencyProgram {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String b = in.nextLine();

            int[] a = toIntArray(b);
            frequency(a);

        }


        static void frequency(int[] x) {

            Arrays.sort(x);
            int counter;

            for (int i = 0; i < x.length; i++) {
                counter = 0;
                if (x[i] == 0 || x[i] != x[i - 1]) {
                    for (int j : x) {
                        if (x[i] == j) {
                            counter += 1;
                        }
                    }
                }
                else {
                    continue;
                }

                if (counter > 1) {
                    System.out.printf("%d -> %d раза\n", x[i], counter);
                }

            }

        }

        public static int[] toIntArray(String y) {

            String[] b = y.split(" ");
            int[] a = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                a[i] = Integer.parseInt(b[i]);
            }
            return a;

        }

    }
