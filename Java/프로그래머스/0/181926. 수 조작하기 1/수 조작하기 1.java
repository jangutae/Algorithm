class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (String s : control.split("")) {
            switch (s) {
                case "w" -> answer += 1;
                case "s" -> answer -= 1;
                case "d" -> answer += 10;
                case "a" -> answer -= 10;
            }
        }
        
        return answer;
    }
}