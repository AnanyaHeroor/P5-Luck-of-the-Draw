/**
 * This class prints out for each amount Sky could bet, the sequence of levels you would
 * expect from a boat game
 * Boat game proceeds as follows:
 *  (1) Sky pays X dollars to set the water level to a height of X. (2) The water rises
and falls the above pattern until it reaches a height of exactly 1. (3) Sky earns an amount of
money Y equal to number of times the water level was changed. Note that Sky’s total profit here
is Y − X
 * @author Ananya Heroor
 */
public class BoatLevels{
    public static void main (String [] args){
        for (int i =2; i<=200; i++){
            printBoatLevels(i);
            System.out.println("");
        }
        }
    public static void printBoatLevels(int n) {
        int waterLevel = n;
        System.out.println("Initial Bet: $" + n);
        System.out.print("Level Sequence: " + waterLevel);
    
        while(waterLevel != 1) {
            if( waterLevel % 2 == 0 ) {
                waterLevel = waterLevel /2;}
            else {
                waterLevel = 3 * waterLevel + 1;
             }
             System.out.print(", " + waterLevel);
        }
        System.out.println("");
       }
    }