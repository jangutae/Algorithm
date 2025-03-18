class Solution {
    public String solution(String myString, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i += m) {
            sb.append(myString.substring(c - 1 + i, c + i));
        }
        
        
        return sb.toString();
    }
}