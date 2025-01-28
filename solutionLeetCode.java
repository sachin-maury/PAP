import java.util.HashSet;
import java.util.Set;

public class solutionLeetCode {

   
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int maxLen = Math.min(s.length(),1);
        Set<Character>find=new HashSet<>();
        while(end<s.length()){
            char a =s.charAt(end);
            while(find.contains(a)){
                find.remove(s.charAt(start));
                start++;
            }
            find.add(a);
            int window=end-start+1;
            maxLen=Math.max(maxLen,window);
            end++;
        }
        return maxLen;
    }
}
