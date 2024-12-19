class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder str = new StringBuilder();
        
        while (n > 0) {
            str.append(n % 3);
            n /= 3;
        }
        
        answer = Integer.parseInt(str.toString(), 3);
               
        return answer;
    }
}