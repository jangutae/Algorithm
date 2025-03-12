class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        
        String operand = str[1];
        switch (operand) {
                case "+" -> answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                case "-" -> answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                case "*" -> answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }
        
        return answer;
    }
}