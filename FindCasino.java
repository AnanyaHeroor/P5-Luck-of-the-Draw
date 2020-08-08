/**
 * This class prints out the location of the casino for an entire year after Sky was kicked out
 * Sky is kicked out of the casino, he wants to sneak back in, the casino moves location every night
 * The professors use an algorithm to determine the location of the casino each night
 * We need to calculate where the casino will be in the future
 * • First, tonight’s x position is determined:
– If last night’s x position is divisible by last night’s y position, then tonight’s x position
is equal to last night’s x divided by last night’s y.
– Otherwise, tonight’s x position is equal to last night’s x times last night’s y.
• Now, tonight’s y position is determined:
– If last night’s y position is less than 10, then tonight’s y position is that plus 1.
– Otherwise, tonight’s y position is last night’s y position minus 9.
 * last when Sky was at the Casino, it had coordinates x = 11 and y = 5
 * @author Ananya Heroor
 */
public class FindCasino{
    public static void main (String[] args){
        int x = 11;
        int y = 5;
         for(int i=1; i <= 365; i++) {
       if( x % y == 0) {
           x = x/y;
       } else {
           x = x * y;
       }
       if (y < 10) {
           y = y + 1;
        } else {
            y = y - 9;
        }
        System.out.println("Day " + i + ": x=" + x + ", y=" + y);
    }
}
}