public class Solution {
    public String longestCommonPrefix(String[] strs) {

    int minLength = Integer.MAX_VALUE;
    int longestPrefix = 0;


        for (String word:strs) {
            if(word.length() < minLength){
                minLength = word.length();
            }
        }


        outerloop:
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length-1; j++) {
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    break outerloop;
                }
            }
            longestPrefix++;
        }

        System.out.println(strs[0].substring(0, longestPrefix));

        if(longestPrefix == 0){
            return "";
        } else {
            return strs[0].substring(0, longestPrefix);
        }

    }
}