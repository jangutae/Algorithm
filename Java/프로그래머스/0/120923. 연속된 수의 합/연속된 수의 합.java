class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int index = 0;
        
        for (int i = 1; i < num; i++) {
            index += i;
        }
        
        int start = (total - index) / num;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}