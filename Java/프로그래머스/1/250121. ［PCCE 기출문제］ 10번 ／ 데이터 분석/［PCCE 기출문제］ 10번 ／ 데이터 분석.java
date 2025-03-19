import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int cnt = 0;
        int index = 0;
        
        switch (ext) {
            case "code":
                cnt = 0;
                index = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i][0] < val_ext) {
                        cnt++;
                    } 
                }
                
                answer = new int[cnt][4];
                for (int i = 0; i < data.length; i++) {
                    if (data[i][0] < val_ext) {
                        answer[index++] = data[i];
                        
                    }
                }
                
                break;
            case "date":
                
                cnt = 0;
                index = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i][1] < val_ext) {
                        cnt++;
                    } 
                }
                
                answer = new int[cnt][0];
                for (int i = 0; i < data.length; i++) {
                    if (data[i][1] < val_ext) {
                        answer[index++] = data[i];
                    }
                }
                
                break;
            case "maximum":
                
                cnt = 0;
                index = 0;
                for (int i = 0; i < data.length; i++) {
                    if (val_ext > data[i][2]) {
                        cnt++;
                    } 
                }
                answer = new int[cnt][4];
                for (int i = 0; i < data.length; i++) {
                    if (val_ext > data[i][2]) {
                        answer[index++] = data[i];
                        
                    }
                }
                break;
            case "remain":
                
                cnt = 0;
                index = 0;
                for (int i = 0; i < data.length; i++) {
                    if (val_ext > data[i][3]) {
                        cnt++;
                    } 
                }
                answer = new int[cnt][4];
                for (int i = 0; i < data.length; i++) {
                    if (val_ext > data[i][3]) {
                        answer[index++] = data[i];
                        
                    }
                }
                break;
                
        }
        
        switch (sort_by) {
            case "code":
                Arrays.sort(answer, Comparator.comparingInt(o -> o[0]));
                break;
                 case "date":
                Arrays.sort(answer, Comparator.comparingInt(o -> o[1]));
                break;
                 case "maximum":
                Arrays.sort(answer, Comparator.comparingInt(o -> o[2]));
                break;
                 case "remain":
                Arrays.sort(answer, Comparator.comparingInt(o -> o[3]));
                break;
        }
        
        return answer;
    }
}