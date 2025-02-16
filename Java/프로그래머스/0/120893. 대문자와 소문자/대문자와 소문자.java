class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chArr = myString.toCharArray();
        
        for (char ch : chArr) {
            if (Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else {
                answer += Character.toUpperCase(ch);
            }
        }
        
        return answer;
    }
}