import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int index = 0;
        int index1 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                index++;
            }
        }
        
        System.out.println(index);
        
        int[] intArr = new int[index];
        
        System.out.println(Arrays.toString(intArr));
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % divisor == 0) {
                intArr[index1] = arr[j];
                index1++;
            } 
        }
        
        if (intArr.length == 0) {
            intArr = new int[]{-1};
        }
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }
}