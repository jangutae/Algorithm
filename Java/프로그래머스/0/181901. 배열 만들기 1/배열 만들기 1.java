class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int index = 1;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * index;
            index++;
            
            
        }
        
        return answer;
    }
}