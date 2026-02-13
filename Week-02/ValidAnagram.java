public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // If lengths differ, cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Increase count for s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Decrease count for t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // If any count is not zero, not an anagram
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println(result);  // true
    }
}
