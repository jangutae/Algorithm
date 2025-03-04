class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        int d = common[1] - common[0];
        int r = (common[0] != 0) ? common[1] / common[0] : 0;
        
        if (common[2] - common[1] == d) {
            answer = common[len - 1] + d;
        } else if (common[2] / common[1] == r && Math.abs(common[2]) % Math.abs(common[1]) == 0 
                   && Math.abs(common[1]) % Math.abs(common[0]) == 0) {
            answer = common[len - 1] * r;
        }
        
        
        return answer;
    }
}