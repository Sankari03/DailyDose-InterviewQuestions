public class RemoveCharacter {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        System.out.println(removeChars(string1,string2));
    }

    private static String removeChars(String string1, String string2) {
        String ans = "";
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (string2.indexOf(c)==-1){
                ans+=c;
            }
        }
        return ans;
    }
}
