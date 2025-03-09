class Solution {
    public int[] solution(int[] numList, int n) {
        int length = numList.length;
        
        int[] answer = new int[length];
        int index = 0;
        
        for (int i = n; i < length; i++) {
            answer[index++] = numList[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[index++] = numList[i];
        }
        
        return answer;
    }
}