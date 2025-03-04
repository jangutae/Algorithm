class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        
        if (a == b) {
            answer = common[len - 1] + a;
        } else {
            answer = common[len - 1] * common[2] / common[1];
        }
         
        return answer;
    }
}