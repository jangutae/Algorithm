class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        char[] chars1 = X.toCharArray();
        char[] chars2 = Y.toCharArray();
        
        
        for (char c : chars1) {
            countX[c - '0']++;    
        }
        
        for (char c : chars2) {
            countY[c - '0']++;    
        }
        
        
        for (int i = 0; i < countX.length; i++) {
            int commonNumber = Math.min(countX[i], countY[i]);
            
            while (commonNumber-- > 0) {
                sb.append(i);        
            }
        }
        
        sb.reverse();
        
        if (sb.length() == 0) {
            return "-1";
        }
        
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}