class Solution {
    public int[] solution(String[] wallpaper) {
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 최솟값 갱신
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    // 최댓값 갱신
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }
}