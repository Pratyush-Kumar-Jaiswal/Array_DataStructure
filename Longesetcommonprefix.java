/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
class Longesetcommonprefix {
    public String longestCommonPrefix(String[] strs) {
        int L = 0;
        for(int i=0;i<strs[0].length();i++){
            int ok = 1;
            for(int j=0;j<strs.length;j++){
                if(L>=strs[j].length() || strs[j].charAt(L)!=strs[0].charAt(L)){
                    ok = 0;
                    break;
                }
            }
            if(ok==1){
                L++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,L);
    }
}
