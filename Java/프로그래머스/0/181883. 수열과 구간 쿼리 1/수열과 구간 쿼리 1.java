class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0]; // 시작 인덱스
            int end = queries[i][1];   // 끝 인덱스
            
            for (int j = start; j <= end; j++) {
                if (j >= 0 && j < answer.length) { // 배열 범위 체크
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}