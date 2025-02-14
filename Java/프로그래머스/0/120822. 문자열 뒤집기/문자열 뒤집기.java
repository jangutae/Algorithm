class Solution {
    public String solution(String myString) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(myString);
        sb.reverse();
        answer = sb.toString();
        // for (int i = strArray.length -1; i >= 0; i--) {
        //    answer = sb.append(strArray[i]).toString();
        // }
        
        return answer;
    }
}