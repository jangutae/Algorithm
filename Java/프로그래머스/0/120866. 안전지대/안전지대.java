class Solution {
    public int solution(int[][] board) {
        int n = board.length; // 보드의 크기 (정사각형)
        int[][] dangerMap = new int[n][n]; // 위험지역 표시할 배열
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // 8방향 (위, 아래, 좌, 우 + 대각선)
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        // 지뢰(1)가 있는 위치를 찾아서 위험지역 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) { // 지뢰 발견
                    dangerMap[i][j] = 1; // 자기 자신도 위험지역

                    // 8방향 탐색
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        // 범위 체크 (배열을 벗어나지 않도록)
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            dangerMap[nx][ny] = 1; // 위험지역 표시
                        }
                    }
                }
            }
        }

        // 안전한 지역 개수 세기 (0의 개수)
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerMap[i][j] == 0) safeCount++;
            }
        }

        return safeCount;
    }
}
