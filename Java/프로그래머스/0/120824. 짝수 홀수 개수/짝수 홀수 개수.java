class Solution {
    public int[] solution(int[] numList) {
        int[] answer = new int[2];
        int evenCount = 0;
        int addCount = 0;
        
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % 2 == 0) {
                evenCount++;
            } else {
                addCount++;
            }
        }
        answer[0] = evenCount;
        answer[1] = addCount;
        
        return answer;
    }
}