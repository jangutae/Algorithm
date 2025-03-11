class Solution {
    public String solution(String myString, int[] indexList) {
        StringBuilder answer = new StringBuilder();
        int len = indexList.length;
        for (int i : indexList) {
            answer.append(myString.charAt(i));
        }
            
        
        return answer.toString();
    }
}