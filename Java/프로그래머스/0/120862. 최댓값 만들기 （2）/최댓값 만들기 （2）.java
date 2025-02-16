import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int multi1 = numbers[0] * numbers[1];
        int multi2 = numbers[numbers.length -1] * numbers[numbers.length -2];
        
        for (int i = 0; i < numbers.length; i++) {
            answer = multi1 > multi2 ? multi1 : multi2;
        }
          
        
        return answer;
    }
}