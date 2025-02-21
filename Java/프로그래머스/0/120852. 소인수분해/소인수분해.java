import java.util.*;

class Solution {
    public int[] solution(int n) {
        int index = 0;
        int temp = n;
        
        Set<Integer> set = new TreeSet<>();
        
        for (int i = 2; i <= n; i++) {
            while (temp % i == 0) {
                set.add(i);
                temp /= i;
                System.out.println(i);
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}