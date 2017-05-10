import java.util.Arrays;
import java.util.Scanner;


public class HorseRacing {
    /* Casablanca’s hippodrome is organizing a new type of horse racing: duals.
    During a dual, only two horses will participate in the race.
    In order for the race to be interesting, it is necessary to try to select two horses with similar strength.
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            array[i] = pi;

        }
        Arrays.sort(array);
        String s = Arrays.toString(array);
        System.err.println("Debug messages..." + s);



        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(""+ + checkMinDifference(array));
    }

    private static int checkMinDifference(int[] array) {
        int x = 10000000;

        for (int i = 1; i <array.length ; i++) {
            if(array[i] - array[i-1] < x){
                x = array[i] - array[i-1];
            }

        }
        return x;
    }
}
