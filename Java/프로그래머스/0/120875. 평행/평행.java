class Solution {
    public int solution(int[][] dots) {
        

        // 가능한 선분 조합을 비교
        if (getSlope(dots[0], dots[1]) != null && getSlope(dots[0], dots[1]).equals(getSlope(dots[2], dots[3]))) return 1;
        if (getSlope(dots[0], dots[2]) != null && getSlope(dots[0], dots[2]).equals(getSlope(dots[1], dots[3]))) return 1;
        if (getSlope(dots[0], dots[3]) != null && getSlope(dots[0], dots[3]).equals(getSlope(dots[1], dots[2]))) return 1;

        return 0;
    }
    
    private Double getSlope(int[] p1, int[] p2) {
            if (p2[0] - p1[0] == 0) return null; // 수직선 예외 처리
            return (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
        }
}