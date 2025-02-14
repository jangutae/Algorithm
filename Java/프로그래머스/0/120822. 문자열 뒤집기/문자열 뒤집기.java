class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String[] strArray = myString.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = strArray.length -1; i >= 0; i--) {
           answer = sb.append(strArray[i]).toString();
        }
        
        return answer;
    }
}