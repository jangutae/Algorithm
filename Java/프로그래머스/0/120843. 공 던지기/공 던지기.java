class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int length = numbers.length;
        
        int index = ((k - 1) * 2) % length; 
        
        answer = numbers[index];
        
        return answer;
    }
}