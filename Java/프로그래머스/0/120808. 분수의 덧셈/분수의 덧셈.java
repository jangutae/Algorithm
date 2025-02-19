class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 최대 공약수
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        int numerator = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);
        int result = gcd(lcm, numerator);
        
        answer[1] = lcm / result;
        answer[0] = numerator / result;        
        
        return answer;
    }
    
     private int gcd(int a, int b) {
        while (b != 0) {
           int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}