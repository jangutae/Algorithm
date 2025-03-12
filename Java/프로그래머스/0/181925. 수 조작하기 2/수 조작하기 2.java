import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int distance = numLog[i - 1] - numLog[i];
            switch (distance) {
                    case -1 -> sb.append("w");
                    case 1 -> sb.append("s");
                    case -10 -> sb.append("d");
                    case 10 -> sb.append("a");
            }
        }
        
        
        
        
        return sb.toString();
    }
}