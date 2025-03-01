class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++) {
            String[] arr = quiz[i].split(" ");
            int value = strToInt(arr[0]) + ((strToInt(arr[2])) * (arr[1].equals("+") ? 1 : -1));
            String result = strToInt(arr[4]) == value ? "O" : "X";
            answer[i] = result;
        }
        
        return answer;
    }
    
    private int strToInt(String s) {
        return Integer.parseInt(s);
    }
}