class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chars = s.toCharArray();
        
        if (chars.length % 2 == 0) {
            answer = String.valueOf(chars[chars.length / 2 - 1]) + String.valueOf(chars[chars.length / 2]);
        } else {
            answer = String.valueOf(chars[chars.length / 2]);
        }
      
        System.out.println(answer);
        return answer;
    }
}