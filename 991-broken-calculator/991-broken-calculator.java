class Solution {
    public int brokenCalc(int start, int target) {
        int ans = 0;
        while(target!=start) {
            if(target<start) {
                ans += start - target;
                target = start;
            }
            else {
                if(target%2==0)
                    target = target/2;
                else
                    target++;
                ans++;
            }
        }
        return ans;
    }
}