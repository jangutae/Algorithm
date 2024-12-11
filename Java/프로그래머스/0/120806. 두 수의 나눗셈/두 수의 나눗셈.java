class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double divide = (double) num1 / num2;
        int intValue = (int) (divide * 1000);
        return intValue;
    }
}