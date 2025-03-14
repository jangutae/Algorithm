import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int width = park[0].length();
        int height = park.length;
         
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i; 
                    answer[1] = j;
                }
            }
        }
        
        int y = answer[0];
        int x = answer[1];
        
        for (String s : routes) {
            
            char ch = s.charAt(0);
            int a = Character.getNumericValue(s.charAt(2));
            
            int tempY = y;
            int tempX = x;
            
            for (int n = 0; n < a; n++) {
            switch (ch) {
                    case 'E': tempX++; break;
                    case 'W': tempX--; break;
                    case 'N': tempY--; break;
                    case 'S': tempY++; break;
                }

                // 범위를 벗어나거나 장애물('X')을 만나면 원래 위치로 되돌리고 중단
                if (tempX < 0 || tempX >= width || tempY < 0 || tempY >= height || park[tempY].charAt(tempX) == 'X') {
                    tempY = y;
                    tempX = x;
                    break;
                }
            }
            y = tempY;
            x = tempX;
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}