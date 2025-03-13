class Solution {
    boolean solution(String s) {
        String lower = s.toLowerCase();        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (lower.charAt(i) == 'p') {
                count++;
            } else if (lower.charAt(i) == 'y') {
                count--;
            }
        }
        
        
       

        return count == 0;
    }
}