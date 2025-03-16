class Solution {
    public int solution(String numStr) {
        int answer = 0;
        char[] chars = numStr.toCharArray();
        
        for (char ch : chars) {
            answer += Character.getNumericValue(ch);
        }
        
        return answer;
    }
}