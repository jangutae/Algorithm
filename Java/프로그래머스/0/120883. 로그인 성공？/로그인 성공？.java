class Solution {
    public String solution(String[] idPw, String[][] db) {
        String answer = "fail";
        String id = idPw[0];
        String pw = idPw[1];
        
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id) && db[i][1].equals(pw)) {
                answer = "login";
            } else if (db[i][0].equals(id) && !db[i][1].equals(pw)) {
                answer = "wrong pw";
            } 
        }
        return answer;
    }
}