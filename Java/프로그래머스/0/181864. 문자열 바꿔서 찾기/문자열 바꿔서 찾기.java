class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.replace("A", "a");
        myString = myString.replace("B", "A");
        myString = myString.replace("a", "B");
        
        if (myString.contains(pat)) answer = 1;
        
        return answer;
    }
}