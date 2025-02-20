class Solution {
    public int solution(String myString) {
        int answer = 0;
        String[] strs = myString.split("[^0-9]+");
        
        for (String s : strs) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}