class Solution {
    public String[] solution(String myStr, int n) {
        // int length = (int) Math.ceil((double) myStr.length() / n);
        String[] answer = new String[(myStr.length() + n - 1) / n];
        
        for (int i = 0; i < answer.length; i++) {
            int startIndex = i * n;
            int lastIndex = Math.min(startIndex + n, myStr.length());
            answer[i] = myStr.substring(startIndex, lastIndex);
        }
        
        return answer;
    }
}