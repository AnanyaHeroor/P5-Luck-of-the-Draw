/**
 * This class for each amount of money that Sky could bet, prints out the length of the boat sequence
 * and the amount of profit Sky could make on such a bet
 * Sky only has $200 on him
 * At the end include a single line stating which bet would give him the most profit,
 * and what that profit would be.
 * @author Ananya Heroor
 */
public class BoatBestBet{
    public static void main (String [] args){
        int bestProfit = 0;
        int bestBet = 0;
        int numberOfChanges = 0;
        int profit = 0;
        for(int i=2; i<=200; i++) {
            System.out.println("Initial bet: $"+i);
            numberOfChanges = computeNumberOfChanges(i);
            profit = numberOfChanges - i;
            System.out.println("Number of Height Changes: "+numberOfChanges);
            System.out.println("Total Profit: $"+profit);
            System.out.println("");
        if( profit > bestProfit) {
            bestProfit = profit;
            bestBet = i;
            }
        }
    System.out.println("Sky's best bet is $"+bestBet+", which would earn him a profit of $"+bestProfit);
    }
 public static int computeNumberOfChanges(int n){
    int numberOfChanges = 0;
     while( n != 1) {
         if( n % 2 == 0) {
             n = n /2 ;
          } else {
             n = n * 3 + 1;
          }
          numberOfChanges += 1;
        }
     return numberOfChanges;
    }
}
