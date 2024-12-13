import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();;
        
      
        System.out.println(x % sum == 0);
        
        
        return x % sum == 0;
    }
}