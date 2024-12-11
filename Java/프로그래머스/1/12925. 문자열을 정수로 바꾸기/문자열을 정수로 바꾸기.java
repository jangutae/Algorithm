class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s); 
        
        if (s.length() >= 1 && s.length() <= 5 && s.charAt(0) != 0) {
             answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}