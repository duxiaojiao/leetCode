package q28_实现strStr;

public class Solution {

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int j = haystack.length();
        for (int i = 0; i < j; i++) {
            if (haystack.startsWith(needle)) {
                return i;
            } else {
                haystack = haystack.substring(1);
            }
        }
        return -1;
    }

}
