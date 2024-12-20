class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String sub = "";
        
        if (t.charAt(0) != '0' && p.charAt(0) != '0') 
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            sub = t.substring(i , i + p.length());
            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
            System.out.println(sub);
        }
        
        return answer;
    }
}