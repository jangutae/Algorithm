class Solution {
    public int solution(int[] numList) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < numList.length; i++) {
            if (i % 2 == 0) {
                odd += numList[i];
            } else {
                even += numList[i];
            }
        }
        
        answer = (odd > even) ? odd : even;
        System.out.println(odd);
        System.out.println(even);
        return answer;
    }
}