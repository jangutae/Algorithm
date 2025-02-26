import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
//         int answer = 0;
//         int max1 = 0;
//         int min1 = dots[0][0];
//         int max2 = 0;
//         int min2 = dots[0][1];
        
//         for (int i = 0; i < dots.length; i++) {
//            if (dots[i][0] > max1) {
//                max1 = dots[i][0];
//            } else if (dots[i][0] < min1) {
//                min1 = dots[i][0];
//            }
//         }
        
//          for (int i = 0; i < dots.length; i++) {
//            if (dots[i][1] > max2) {
//                max2 = dots[i][1];
//            } else if (dots[i][1] < min2) {
//                min2 = dots[i][1];
//            }
//         }
        
//         System.out.println(max1);
//         System.out.println(min1);
//         System.out.println(max2);
//         System.out.println(min2);
//         System.out.println(dots);
        
//         answer = Math.abs((max1 - min1) * (max2 - min2)); 
        
//         return answer;
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        int width = maxX - minX;
        int height = maxY - minY;
        
        return width * height;
    }
}