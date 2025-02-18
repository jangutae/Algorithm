import java.util.*;

class Solution {
    public String solution(String myString) {
//         String answer = "";
//         StringBuilder sb = new StringBuilder();
    
        
//         String[] strArr = myString.split("");
//         Set<String> strSet = new LinkedHashSet<>(Arrays.asList(strArr));

//         for (String s : strSet) {
//             sb.append(s);                
//         }
//         answer = sb.toString();
        
         String answer = "";

        for(int i=0; i<myString.length(); i++){
            //myString.indexOf(my_string.charAt(i));
            if(i==myString.indexOf(myString.charAt(i)))
                answer+=myString.charAt(i);
        }

        return answer;
        
    }
}