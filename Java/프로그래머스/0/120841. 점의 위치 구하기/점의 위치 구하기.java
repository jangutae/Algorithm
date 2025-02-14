import java.util.*;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        String[] array = new String[]{String.valueOf(dot[0]), String.valueOf(dot[1])};
        
        if (array[0].contains("-") && array[1].contains("-")) {
            answer = 3;
        } else if (array[0].contains("-") && !array[1].contains("-")) {
            answer = 2;
        } else if (!array[0].contains("-") && array[1].contains("-")) {
            answer = 4;
        } else if (!array[0].contains("-") && !array[1].contains("-")) {
            answer = 1;
        }
        
        return answer;
    }
}