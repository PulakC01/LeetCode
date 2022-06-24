class Solution {
    public int leastInterval(char[] tasks, int n) {
        // count char freq, task name doesn't matter, only freq matters
        int[] freq = new int[26];
        for (char c: tasks) freq[c - 'A']++;
        // sort first, so we have max freq at freq[25]
        Arrays.sort(freq);
        int time = 0;
        while (freq[25] > 0) { // while we still have task to do, start from most freq task
            // GREEDY
            // each round/row, try to finish n tasks
            for (int i = 0, p = 25; i <= n; i++) { // n is the cooling down factor, p points to the next task to consume
                if (p >= 0 && freq[p] > 0) { // if there is still task to do
                    freq[p]--; // do task
                    p--;       // move p to next freq task
                    time++;    // take one cycle
                }
                else if (freq[25] != 0)  // if this is NOT last row, need to fill in idle cycle
                    time++;    // take one cycle
                
              //else freq[25] == 0 .   no more task to do and last row. we WON'T fill in idle cycle
            }
            // sort again so next round we're going to start from most freq task and consume n task if possible
            Arrays.sort(freq);
        }
        return time; 
    }
}