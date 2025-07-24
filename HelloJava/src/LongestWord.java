import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        System.out.println(longestWord(sentence));

    }

    public static String longestWord(String a) {
        String[] words = a.split(" ");
        String thatWord = words[0];
        for (String word : words) {
            if (word.length() > thatWord.length()) {
                thatWord = word;
            }
        }
        return thatWord;

    }

}
