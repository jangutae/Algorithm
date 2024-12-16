class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        // 1 <= seoul.length <= 1000
        // 1 <= seoul[0].length <= 20
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i +"에 있다";
                    break;
            }
        }
        return answer;
    }
}