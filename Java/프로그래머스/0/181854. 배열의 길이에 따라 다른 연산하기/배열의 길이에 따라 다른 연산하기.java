class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        
        for (int i = len - 1; i >=0 ; i-=2) {
            arr[i] += n;
           
        }
       
        
        return arr;
    }
}