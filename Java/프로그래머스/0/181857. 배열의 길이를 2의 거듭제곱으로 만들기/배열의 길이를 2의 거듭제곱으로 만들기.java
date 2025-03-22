class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        
        for (int i = 0; i <= 10; i++) {
            if (len < Math.pow(2, i)) {
                int cnt = (int) Math.pow(2, i) - len;
                answer = new int[cnt + len];
                
                for (int j = 0; j < len; j++) {
                    answer[j] = arr[j];
                }
                break;
                
            } else if (len == Math.pow(2, i)) {
                answer = arr.clone();
                break;
            }
        }
        
       
        
        return answer;
    }
}