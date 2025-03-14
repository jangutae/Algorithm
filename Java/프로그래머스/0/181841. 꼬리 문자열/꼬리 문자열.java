class Solution {
    public String solution(String[] strList, String ex) {
        StringBuilder answer = new StringBuilder();
        
        for (String s : strList) {
            if (!s.contains(ex)) answer.append(s);
        }
        
        return answer.toString();
    }
}