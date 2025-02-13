class Solution {
    public String solution(String myString, String letter) {
        String answer = "";
        
        answer = myString.replaceAll(letter, "");
        System.out.println(answer);
        
        return answer;
    }
}