class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        
        for (int i : num_list) {
            sum += i;
            multi *= i;
        }
        
        int answer = Math.pow(sum, 2) > multi ? 1 : 0;
        
        System.out.println(multi);
        System.out.println(Math.pow(sum, 2));
        
        return answer;
    }
}