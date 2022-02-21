class Solution {
    public int addDigits(int num) {
        String str = String.valueOf(num);
        while(str.length()>1) {
            int sum = 0;
         
            while (num != 0) {
                sum = sum + num % 10;
                num = num/10;
            }
            num = sum;
            str = String.valueOf(num);
        }
        return num;
    }
}