class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] splitedA = num1.split("\\+");
        String[] splitedB = num2.split("\\+");
        int r1 = Integer.parseInt(splitedA[0]);
        int i1 = Integer.parseInt(splitedA[1].split("i")[0]);
        int r2 = Integer.parseInt(splitedB[0]);
        int i2 = Integer.parseInt(splitedB[1].split("i")[0]);
        return String.valueOf(r1 * r2 - i1 * i2) + "+" + String.valueOf(r1 * i2 + r2 * i1) + "i";
    }
}