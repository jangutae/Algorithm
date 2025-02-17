import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        int index = 0;
        
        char[] chars = myString.toCharArray();
        
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                index++;
            }
        }
        
        int[] answer = new int[index];
        index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                answer[index++] = Character.getNumericValue(chars[i]);
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}