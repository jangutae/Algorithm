import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        int[][] arr = new int[sizes.length][2];
        
        for (int i = 0; i < sizes.length; i++) {
            
            int valueX = sizes[i][0];
            int valueY = sizes[i][1];
            
            arr[i][0] = valueX > valueY ? valueX : valueY;
            arr[i][1] = valueX < valueY ? valueX : valueY;
        }
        
        for (int i = 0; i < sizes.length; i++) {
            
            int valueX = arr[i][0];
            int valueY = arr[i][1];
            
            if (valueX > maxX) {
                maxX = valueX;
            }
            
            if (valueY > maxY) {
                maxY = valueY;
            }
        }
        
        answer = maxX * maxY;
        
        
        System.out.println(maxX);
        System.out.println(maxY);
        return answer;
    }
}