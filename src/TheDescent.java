import java.util.Scanner;


public class TheDescent {

    /* Destroy the mountains before your starship collides with one of them.
    For that, shoot the highest mountain on your path.

    At the start of each game turn, you are given the height of the 8 mountains from left to right.
    By the end of the game turn, you must fire on the highest mountain by outputting its index (from 0 to 7).


    Firing on a mountain will only destroy part of it, reducing its height. Your ship descends after each pass.
     */

    public static void main(String args[]) {
        int[] mountains = new int[8];
        int target = 0;
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                mountains[i] = mountainH;
            }
            // int wysokosc = 9;


            // for (int i = 0; i < mountains.length; i++) {
            //     if (mountains[i] == wysokosc) {
            //         System.out.println("odnaleziono wysookosc " + wysokosc + "pod indeksem " + i);
            //         target = i;
            //     }
            //     wysokosc--;
            // }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(maxValueIndex(mountains)); // The index of the mountain to fire on.
        }
    }
    public static int maxValueIndex(int[] tab) {
        int maxValue = tab[0];
        int maxIndex = 0;
        for(int i = 1; i<tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
