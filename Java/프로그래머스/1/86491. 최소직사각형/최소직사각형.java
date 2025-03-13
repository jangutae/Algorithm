class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int minY = 0;
        
        for (int[] card : sizes) {
            maxX = Math.max(maxX, Math.max(card[0], card[1]));
            minY = Math.max(minY, Math.min(card[0], card[1]));
        }
        
        answer = maxX * minY;
        return answer;
    }
}