import java.util.Arrays;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        char[] chArr = myString.toCharArray();
        
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        
        // StringBuilder answer = new StringBuilder(new String(chArr));
        
        return answer;
        // return answer.toString();
    }
}