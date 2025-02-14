class Solution {
    public int[] solution(int n, int[] numList) {
        int index = 0;
        int index1 = 0;
        for (int i = 0; i < numList.length; i++) {
           if (numList[i] % n == 0) {
               index++;
           }
        }
        
        int[] answer = new int[index];
        
        for (int i = 0; i < numList.length; i++) {
           if (numList[i] % n == 0) {
               answer[index1++] = numList[i];
           }
        }
        
        return answer;
    }
}