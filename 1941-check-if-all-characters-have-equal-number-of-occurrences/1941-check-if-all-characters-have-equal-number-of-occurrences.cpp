class Solution {
public:
    bool areOccurrencesEqual(string s) {
        int len = s.size();
        int freq[26] = {};    
        for(int i=0;i<len;i++)
            freq[s[i] - 'a']++;
        
        int x= freq[s[0] - 'a']; 
        
        for(int i=0;i<26;i++) {
           if(x!=freq[i] && freq[i]!=0)   
               return false;
        }
        return true;
    }
};