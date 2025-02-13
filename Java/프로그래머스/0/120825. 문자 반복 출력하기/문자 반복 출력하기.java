class Solution {
    public String solution(String myString, int n) {
        String answer = "";
        String[] array = myString.split("");
        StringBuilder sb = new StringBuilder();
        
        for (String str : array) {
            answer = sb.append(str.repeat(n)).toString();            
        }
    
        
        return answer;
    }
}