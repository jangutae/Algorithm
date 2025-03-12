import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> makeBurger = new Stack<>();
        
        for (int i : ingredient) {
            makeBurger.push(i);
        
        
        if (makeBurger.size() >= 4) {
            int size = makeBurger.size();
            if (
            makeBurger.get(size - 4) == 1 &&
            makeBurger.get(size - 3) == 2 &&
            makeBurger.get(size - 2) == 3 &&
            makeBurger.get(size - 1) == 1) {
                makeBurger.pop();
                makeBurger.pop();
                makeBurger.pop();
                makeBurger.pop();
                
                answer++;
            }
            
        }
        }
        
        return answer;
    }
}