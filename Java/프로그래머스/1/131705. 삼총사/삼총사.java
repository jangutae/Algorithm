class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 학생 정수 번호 학생 3명 정수 번호 플러스 -> 0 이되면 
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                   if (number[i] + number[j] + number[k] == 0) {
                       answer++;
                   }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}