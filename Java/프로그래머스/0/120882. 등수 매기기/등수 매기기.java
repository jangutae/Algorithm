import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        
        
        Map<Double, Integer> averageRank = new HashMap<>();
        
        for (int i = 0; i < score.length; i++) {
            average[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        
        double[] clone = average.clone();
        
        Arrays.sort(clone);
        int length = clone.length;
        
        for (int i = 0; i < length; i++) {
            averageRank.put(clone[i], length - i);
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = averageRank.get(average[i]);
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}