class Solution {
    public String solution(String myString, int n) {
        String answer = "";
        String[] array = myString.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < n; i++) {
            answer = sb.append(array[j]).toString();
            }    
        }
    
        
        return answer;
    }
}