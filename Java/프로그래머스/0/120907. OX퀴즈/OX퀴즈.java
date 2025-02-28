class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int sum = 0;
        String value = "";
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
           
            sum = Integer.parseInt(arr[0]) + (Integer.parseInt(arr[2]) * (arr[1].equals("+") ? 1 : -1));
            value = (Integer.parseInt(arr[4]) == sum) ? "O" : "X"; 
                
            
           answer[i] = value;
        }
        
        return answer;
    }
}