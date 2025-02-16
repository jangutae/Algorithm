import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] < 0 && numbers[1] < 0) {
                answer = numbers[0] * numbers[1] > numbers[numbers.length -1] * numbers[numbers.length -2]
                ? numbers[0] * numbers[1] : numbers[numbers.length -1] * numbers[numbers.length -2];
            } else {
                answer = numbers[numbers.length -1] * numbers[numbers.length -2];    
            }
        }
        
        return answer;
    }
}