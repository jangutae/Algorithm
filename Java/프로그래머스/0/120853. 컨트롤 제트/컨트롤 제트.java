class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strs = s.split(" ");
        int lastNum = 0;
        
        for (String text : strs) {
            if (text.equals("Z")) {
                answer -= lastNum;  
            } else {
                lastNum = Integer.parseInt(text);
                answer += lastNum;
            }
        }
        return answer;
    }
}