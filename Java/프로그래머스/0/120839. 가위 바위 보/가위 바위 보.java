class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] array = rsp.split("");
        StringBuilder sb = new StringBuilder();
        
        for (String s : array) {
            switch(s) {
                case "0" -> sb.append("5");
                case "5" -> sb.append("2");
                case "2" -> sb.append("0");
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}