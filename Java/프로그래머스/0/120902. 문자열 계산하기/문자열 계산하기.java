class Solution {
    public int solution(String myString) {
        String[] tokens = myString.split(" ");
        int result = Integer.parseInt(tokens[0]);
        
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        
        return result;
    }
}