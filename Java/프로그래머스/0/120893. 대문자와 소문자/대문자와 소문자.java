class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chars = myString.toCharArray();
        
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                answer += String.valueOf(ch).toLowerCase();
            } else {
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        return answer;
    }
}