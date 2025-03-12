class Solution {
    public int[] solution(int[] numList) {
        int len = numList.length;
        int[] answer = new int[len + 1];
        int index = 0;
        
        for (int i = 0; i < len; i++) {
            answer[i] = numList[index];
            index++;
            answer[len] = numList[len - 1] > numList[len - 2] 
                ? numList[len - 1] - numList[len - 2] 
                : numList[len - 1] * 2;
        }
        
        
        return answer;
    }
}