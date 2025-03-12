import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0; // 포장된 햄버거 개수

        for (int ing : ingredient) {
            stack.push(ing); // 재료 추가

            // 스택의 마지막 4개가 [1,2,3,1]인지 확인
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 && 
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {
                    
                    // 햄버거 포장 -> 마지막 4개 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();

                    count++; // 햄버거 개수 증가
                }
            }
        }
        return count;
    }
}