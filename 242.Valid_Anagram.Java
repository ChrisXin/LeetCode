public class Solution {
   public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    List<Character> tletters = new ArrayList<Character>();
    for (int i = 0; i < t.length(); i++) {
        tletters.add(t.charAt(i));
    }
    for (int i = 0; i < s.length(); i++) {
        if (!tletters.contains(s.charAt(i))) {
            return false;
        } else {
            // remove will treat a char as an index
            // unless it is cast as an Object
            tletters.remove((Character)s.charAt(i));
        }
    }
    return true;
}
}
