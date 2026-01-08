import java.util.HashMap;

public class valid_Anagram_LC242 {
    public static void main(String args[]) {
        String s = "aba";
        String t = "aab";
        System.out.println(isAnagram(s, t));
    }

    static Boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            int freq = 0;
            if (map.containsKey(key)) {
                freq = map.get(key);
            }
            freq++;
            map.put(key, /*  */ freq);
        }

        for (int j = 0; j < t.length(); j++) {
            char key = t.charAt(j);

            if (map.containsKey(key)) {
                int freq = map.get(key);
                freq--;
                map.put(key, freq);
            } else {
                return false;
            }

        }
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
