class Solution {
    public long solution(int balls, int share) {
       
        return combination(balls, share);
    }
    
     private long combination(int balls, int share) {
        if (share > balls - share) share = balls - share; // 대칭성 활용 (nCr = nC(n-r))
        long result = 1;

        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }

        return result;
    }
}