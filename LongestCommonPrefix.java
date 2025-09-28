public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string is the longest common prefix
        String prefix = strs[0];

        // Iterate through the remaining strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with the next string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix until it matches the beginning of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);
                // If no common prefix, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));
    }
}