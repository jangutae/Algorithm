class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
        int b = 0; 
        char[] chars = s.toCharArray();
        char ch = chars[0];
              
        for (int i = 0; i < chars.length; i++) {
            
            if (chars[i] == ch) {
                a++;
            } else {
                b++;
            }
            
            if (a == b) {
                answer++;
                
                if (i + 1 < chars.length) {
                    ch = chars[i + 1];
                }
            }
        }
        
        if (a != b) {
            answer++;
        }
        
        return answer;
    }
}