class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int value : array) {
            sb.append(value);
        }
        
        String result = sb.toString();
        
        for (String s : result.split("")) {
            if (s.equals(String.valueOf(7))) answer++;
        }
        return answer;
    }
}