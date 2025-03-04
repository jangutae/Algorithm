class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[][] dangerMap = new int[len][len];
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // 8방향 (대각선 포함)
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    dangerMap[i][j] = 1;
                    
                    for (int d = 0; d < dx.length; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        // 배열 경계를 벗어나지 않도록 체크
                        if (nx >= 0 && nx < len && ny >= 0 && ny < len) {
                            dangerMap[nx][ny] = 1;
                        }
                    }
                    
                }
            }
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dangerMap[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}