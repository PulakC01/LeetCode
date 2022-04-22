class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while(target > 0 && maxDoubles > 0) {
            if(target % 2 == 0) {
                target = target / 2;
                maxDoubles--;
            } else 
                target--;
            
            moves++;
        }
        //If we have run out of doubling moves, only weay to reach '1', it to decrement target by '1' in each step which is basically 'target' steps in total
        return moves + target - 1;
    }
}