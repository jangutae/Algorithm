import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, String> map = new HashMap<>();
        
        for (int i = 0; i <= 9; i++) {
            map.put(numberArr[i], String.valueOf(i));
        }
        
        for (int i = 0; i < numberArr.length; i++) {
            numbers = numbers.replace(numberArr[i], map.get(numberArr[i]));
        }
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}