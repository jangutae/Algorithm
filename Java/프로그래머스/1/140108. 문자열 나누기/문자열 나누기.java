class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
        int b = 0; 
        char ch = s.charAt(0);
              
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == ch) {
                a++;
            } else if (s.charAt(i) != ch) {
                b++;
            }
            
            if (a == b) {
                answer++;
                
                if (i + 1 < s.length()) {
                    ch = s.charAt(i + 1);
                }
            }
        }
        
        if (a != b) {
            answer++;
        }
        
        return answer;
    }
}