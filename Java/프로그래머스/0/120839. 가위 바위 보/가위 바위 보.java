class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] array = rsp.split("");
        StringBuilder sb = new StringBuilder();
        
        for (String s : array) {
            if (s.equals("2")) {
                sb.append("0");
            } else if (s.equals("5")) {
                sb.append("2");
            } else {
                sb.append("5");
            }
            answer = sb.toString();
        }
        
        return answer;
    }
}