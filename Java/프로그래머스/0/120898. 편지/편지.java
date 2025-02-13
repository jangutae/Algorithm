class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] arrays = message.split("");
        answer = arrays.length * 2; 
        return answer;
    }
}