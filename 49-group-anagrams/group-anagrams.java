import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use HashMap for O(1) average time complexity for lookup/insertion
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            // 1. Create the 26-element character count array
            int[] count = new int[26];
            
            // 2. Populate the character count
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // 3. Create the unique key using Arrays.toString()
            // This converts the array [1, 0, 0, 1, ...] into a String like "[1, 0, 0, 1, ...]"
            String key = Arrays.toString(count);

            // 4. Add the string to the list corresponding to the key
            // computeIfAbsent is used to automatically create a new ArrayList if the key doesn't exist.
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // 5. Return all the groups (the values of the HashMap)
        return new ArrayList<>(result.values());
    }
}