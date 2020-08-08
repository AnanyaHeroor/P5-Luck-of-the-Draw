/**
 * This class prints out the probability that Sky wins this game (by cheating)
 * @author Ananya Heroor
 */
public class CheatyDice{
    public static void main (String[] args){
        double totalRolls=0;
        int winningRolls=0;
        for (int i = 1; i<=20;i++){
            for (int j = 1; j<=20; j++){
                for (int k = 1; k<=20; k++){
                    totalRolls+=1;
                if (((i>j) && (i-j<=3)) || ((i<j) && (j-i<=3)) || ((i>k) && (i-k<=3) || (i<k) && (k-i<=3) || (j>k) && (j-k<=3) || (j<k) && (k-j<=3))){
                    winningRolls+=1;
                }
                    // System.out.println(i);
                    // System.out.println(j);
                    // System.out.println(k);
                    // System.out.println("-");
                } 
            }
        } System.out.println("Sky has a " + ((winningRolls/totalRolls)*100.0) + "% chance of winning if he cheats.");
    }
}