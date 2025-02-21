class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minClose = Math.abs(array[0] - n);
        
        for (int i = 0; i < array.length; i++) {
            int close = Math.abs(array[i] - n);
            
            if (close < minClose || minClose == close && array[i] < answer) {
                answer = array[i];
                minClose = close;
            }
        }
  
        return answer;
    }
}