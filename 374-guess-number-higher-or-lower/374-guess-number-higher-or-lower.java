/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1, last = n;
        int mid = 0;
        while( first <= last ) {  
            mid = (last-first) / 2 + first;
            if (guess(mid)==1) 
                first = mid + 1;     
            else if (guess(mid)==0)
                return mid; 
            else
                last = mid - 1;    
        }  
       return -1;  
    }
}