class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        // 물은 항상 0개
        // 각 자리에 나누기 2 의 몫이 반복하는 횟수
        // 2보다 작으면 배치 x 
        
        
        for (int i = 1; i < food.length; i++) {
            int value = food[i];
            
            if (value >= 2) {
                for (int j = 1; j <= value / 2; j++) {
                     answer.append(i);
                }
            }
        }
        String s1 = answer.toString();
        String s = answer.reverse().toString();
        
        StringBuilder result = new StringBuilder();
        
        result.append(s1).append(0).append(s);
        
        
        return result.toString();
    }
}