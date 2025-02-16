class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp % 5 == 0) {
            answer = hp / 5;
        } else if (hp % 5 < 3) {
            answer = (int) hp / 5 + hp % 5;
        } else if (hp % 5 < 5) {
            if ((hp % 5) % 3 == 0) {
                answer = (int) hp / 5 + 1;
            } else if ((hp % 5) % 3 == 1) {
                answer = (int) hp / 5 + 2;
            }
        }
        return answer;
    }
}