class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        // 숫자 0 ~ 9
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonNumber = Math.min(countX[i], countY[i]);
            
            while (commonNumber > 0) {
                sb.append(i);
                commonNumber--;
            }
        }
        
        if (sb.length() == 0) {
            answer = "-1";
        } else if (sb.charAt(0) == '0') {
            answer = "0";
        } else {
            answer = sb.toString();
        }
    
        
        
        return answer;
    }
}