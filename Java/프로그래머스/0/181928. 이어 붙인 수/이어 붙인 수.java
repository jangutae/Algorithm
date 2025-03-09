class Solution {
    public int solution(int[] numList) {
        int answer = 0;
        String evenSum = "";
        String oddSum = "";
        
        
        for (int i : numList) {
            if (i % 2 == 0) {
                evenSum += String.valueOf(i);
            } else {
                oddSum += String.valueOf(i);
            }
        }
        
        answer = Integer.parseInt(evenSum) + Integer.parseInt(oddSum);
        
        return answer;
    }
}