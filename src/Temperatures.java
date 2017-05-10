import java.util.Scanner;


public class Temperatures {

    /*Write a program that prints the temperature closest to 0 among input data.
    If two numbers are equally close to zero, positive integer has to be considered closest to zero
     (for instance, if the temperatures are -5 and 5, then display 5).

     */
    static int nMin, pMin;
    static Integer[] ints;
    static String[] parts;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        System.err.println("Debug messages..." + temps);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        parts = temps.split(" ");
        ints = new Integer[parts.length];
//        System.out.println(parts[0]);
        if (!parts[0].equals("")) {
            for (int i = 0; i < parts.length; i++) {
                ints[i] = Integer.parseInt(parts[i]);

            }
        }
//        System.out.println("1 liczba" + ints[1]);


        int pMin = getpMin(ints);
        int nMin = getnMin(ints);

        int closeZero = checkTemp(pMin, nMin);

//        System.out.println("int close zero: " + closeZero);
//        System.out.println("pmin" + pMin);
//        System.out.println("nmin" + nMin);


        System.out.println(""+closeZero);

    }

    private static int getpMin(Integer[] ints) {
        int pMin = 99999;
        if (!parts[0].equals("")) {
            for (Integer x : ints) {
                if (x >= 0 && x < pMin) {
                    pMin = x;
                }
            }
            return pMin;
        }
        return 0;
    }
//        return 10000;
//    }

    private static int getnMin(Integer[] ints) {
        int nMin = -99999;
        if (!parts[0].equals("")) {
            for (Integer x : ints) {
                if (x <= 0 && x > nMin) {
                    nMin = x;
                }
            }
            return nMin;
        }
        return 0;
    }


    public static int checkTemp(int pMin, int nMin) {
        if (!parts[0].equals("")) {
            if (pMin < -nMin) {
                return pMin;
            } else if (-nMin < pMin) {
                return nMin;

            } else {
                return pMin;
            }
        }
        return 0;
    }
}
