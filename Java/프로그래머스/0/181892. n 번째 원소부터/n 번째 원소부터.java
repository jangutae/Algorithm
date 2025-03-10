class Solution {
    public int[] solution(int[] numList, int n) {
        int len = numList.length - n + 1;
        int[] answer = new int[len];
        int index = 0;
        
        for (int i = n - 1; i < numList.length; i++) {
            answer[index] = numList[i];
            index++;
        }
        
        return answer;
    }
}