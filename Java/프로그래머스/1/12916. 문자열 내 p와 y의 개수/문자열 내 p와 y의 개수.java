class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        
        return s.chars().filter(p -> p == 'p').count() == s.chars().filter(y -> y == 'y').count(); 

    }
}