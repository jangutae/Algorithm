class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        
        for (int i : arr) {
            sum += i;
        }
        
        int[] answer = new int[sum];
        int index = 0;
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                answer[index++] = a;
            }
        }
        
        return answer;
    }
}