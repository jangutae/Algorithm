class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
                System.out.println(max);
            }
        }
        return max;
    }
}