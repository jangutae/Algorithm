class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int mother = denom1 * denom2;
        int totalSon = numer1 * denom2 + numer2 * denom1;
        
        for (int i = mother; i > 0; i--) {
            if (mother % i == 0 && totalSon % i == 0) {
                mother /= i;
                totalSon /= i;
            }
        }
        
        
        
        return new int[]{totalSon, mother};
    }
}