import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split("");
        Arrays.sort(strs);
        
        for ( String ch : strs ) {
            if ( s.indexOf( ch ) == s.lastIndexOf( ch ) )
                sb.append( ch );
        }
        return sb.toString();
    }
}