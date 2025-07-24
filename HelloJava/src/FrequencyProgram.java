
    import java.util.Scanner;

    public class FrequencyProgram {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String b = in.nextLine();

            int[] a = toIntArray(b);
            frequency(a);

        }


        static void frequency(int[] x) {
            int[] counts = new int[10];

            for (int num : x) {
                counts[num]++;
            }

            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 1) {
                    System.out.printf("%d -> %d раза\n", i, counts[i]);
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
