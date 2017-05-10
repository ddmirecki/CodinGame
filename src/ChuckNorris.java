import java.util.Scanner;


public class ChuckNorris {

    /* Binary with 0 and 1 is good, but binary with only 0, or almost, is even better!
    Originally, this is a concept designed by Chuck Norris to send so called unary messages.

    Here is the encoding principle:

   The input message consists of ASCII characters (7-bit)
   The encoded output message consists of blocks of 0
   A block is separated from another block by a space
   Two consecutive blocks are used to produce a series of same value bits (only 1 or 0 values):
   - First block: it is always 0 or 00. If it is 0, then the series contains 1, if not, it contains 0
   - Second block: the number of 0 in this block is the number of bits in the series
     */

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        char[] chars = MESSAGE.toCharArray();
        StringBuilder binarny = new StringBuilder();

        for (char car : chars) {
            String change = Integer.toBinaryString(car);
            if (change.length() >= 7) {
                binarny.append(change);
            } else {
                binarny.append('0' + change);

            }
        }
        String s = new String(binarny);
        String[] split = s.split("");


        String unary = chuck(split);
        System.out.println(unary);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }

    public static String encodeGroup(String input) {
        String sign;
        int groupSize = 0;
        String encoded = "";
        // A
        String[] tab = input.split("");
        if (tab[0].equals("0")) {
            sign = "0";
        } else {
            sign = "1";
        }

        //B

        for (int i = 0; i < tab.length; i++) {
            if (tab[i].equals(sign)) {
                groupSize++;
            } else {
                break;
            }
        }
        if (sign.equals("0")) {
            encoded = "00 ";
            for (int i = 0; i < groupSize; i++) {
                encoded = encoded + "0";
            }
        } else {
            encoded = "0 ";
            for (int i = 0; i < groupSize; i++) {
                encoded = encoded + "0";

            }
        }
        return encoded;

    }

    public static String chuck(String[] input) {
        String group = input[0];
        String previous = input[0];
        String chuck = "";
        int position;
        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(previous)) {
                group += input[i];
            } else {
                chuck += encodeGroup(group);
                chuck += " ";
                group = input[i];

            }
            previous = input[i];

        }
        chuck += encodeGroup(group);
        return chuck;

    }
}
