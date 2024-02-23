public class PangramString {
    public static void main(String[] args) {
        String  S = "Pack mY box witH fIve dozen liquor jugs";
        System.out.println(isPangram(S));
    }
    public static int isPangram(String S) {
        S = S.replaceAll("\\s", "").toLowerCase();
        int n = S.length();
        int[] arr = new int[26];
        if(n < 26){
            return 0;
        }
        for(int i = 0; i < n; i++){
            char s = S.charAt(i);
            if(s >= 97 && s <= 122){
                int index = (int)s-97;
                arr[index]++;
            }
        }
        for (int j : arr) {
            if (j == 0) {
                return 0;
            }
        }
        return 1;
    }
}
