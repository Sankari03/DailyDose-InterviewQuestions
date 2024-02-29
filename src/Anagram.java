import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String a = "bat";
        String b = "tab";
        System.out.println(isAnagram(a,b));
    }

    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char s = a.charAt(i);
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < b.length(); i++) {
            char s = b.charAt(i);
            if (map.containsKey(s)) {
                if(map.get(s) > 0){
                    map.put(s, map.get(s)-1);
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
