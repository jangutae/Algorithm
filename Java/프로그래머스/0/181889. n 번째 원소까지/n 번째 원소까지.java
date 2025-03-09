class Solution {
    public int[] solution(int[] numList, int n) {
        int[] answer = new int[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            answer[index++] = numList[i];
        }
        
        return answer;
    }
}