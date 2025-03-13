class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String lower = s.toLowerCase();
        String[] str = lower.split("");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                p++;
            } else if (str[i].equals("y")) {
                y++;
            }
        }
        
        answer = p == y ? true : false; 
        return answer;
    }
}