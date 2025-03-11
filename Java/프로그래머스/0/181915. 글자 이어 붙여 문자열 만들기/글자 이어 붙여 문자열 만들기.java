class Solution {
    public String solution(String myString, int[] indexList) {
        String answer = "";
        int len = indexList.length;
        for (int i = 0; i < len; i++) {
            answer += myString.charAt(indexList[i]);
        }
            
        
        return answer;
    }
}