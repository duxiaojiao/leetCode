package q16_最长公共前缀;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String s = strs[0];
        for (String str : strs) {
            while(!str.startsWith(s)){
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
