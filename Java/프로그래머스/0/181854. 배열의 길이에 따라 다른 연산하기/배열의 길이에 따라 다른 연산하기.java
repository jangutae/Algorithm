class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
            
            if (len % 2 == 0 && i % 2 == 1) {
                answer[i] += n;
            } else if (len % 2 == 1 && i % 2 == 0) {
                answer[i] += n;
            }
        }
       
        
        return answer;
    }
}