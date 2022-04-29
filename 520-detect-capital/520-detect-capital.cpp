class Solution {
public:
    bool detectCapitalUse(string word) {
        bool firstCap = isupper(word[0]), allRestCaps = true, allRestSmall = true;
        for(int i=1;i<word.size();i++) {
            if(isupper(word[i])) {
                allRestSmall = false;
            }
            else {
                allRestCaps = false;
            }
        }
        return ((firstCap && allRestCaps) || (firstCap && allRestSmall) || (!firstCap && allRestSmall));
    }
};