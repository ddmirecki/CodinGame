import java.util.Scanner;


public class PowerOfThor {

    /* Your program must allow Thor to reach the light of power.

    Thor moves on a map which is 40 wide by 18 high.
    Note that the coordinates (X and Y) start at the top left!
    This means the most top left cell has the coordinates "X=0,Y=0"
    and the most bottom right one has the coordinates "X=39,Y=17".

    Once the program starts you are given:
    the variable lightX: the X position of the light of power that Thor must reach.
    the variable lightY: the Y position of the light of power that Thor must reach.
    the variable initialTX: the starting X position of Thor.
    the variable initialTY: the starting Y position of Thor.

    At the end of the game turn, you must output the direction in which you want Thor to go among:
     */
    static int tx = -1, ty = -1;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        tx = initialTX;
        ty = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
            System.out.println(ruchY(lightY)+ruchX(lightX));
        }
    }

    public static String ruchX(int x){

        if(x > tx){
            tx++;
            return "E";
        } else if(x < tx){
            tx--;
            return "W";
        }else{
            return "";
        }

    }
    public static String ruchY(int y){
        if(y > ty){
            ty++;
            return "S";
        } else if(y < ty){
            ty--;
            return "N";
        }else{
            return "";
        }
    }
}
