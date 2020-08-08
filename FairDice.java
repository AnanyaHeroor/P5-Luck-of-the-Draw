/**
 * This class prints out the probability that Sky wins this game.
 * @author Ananya Heroor
 */
public class FairDice{
    public static void main (String[] args){
        double totalRolls=0;
        int winningRolls=0;
        for (int i = 1; i<=20;i++){
            for (int j = 1; j<=20; j++){
                totalRolls+=1;
                if (((i>j) && (i-j<=3)) || ((i<j) && (j-i<=3))){
                    winningRolls+=1;
                    // System.out.println(i);
                    // System.out.println(j);
                    // System.out.println("-");
                } 
            }
        } System.out.println("Sky has a " + ((winningRolls/totalRolls)*100.0) + "% chance of winning.");
        // System.out.println(winningRolls);
    
    }
}