class Solution {
    public int solution(String myString) {
        int answer = 0;
        char[] chars = myString.toCharArray(); 
        
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                answer += Character.getNumericValue(ch);    
            }
            
        }
        return answer;
    }
}