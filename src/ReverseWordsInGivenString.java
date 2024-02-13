public class ReverseWordsInGivenString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String S)
    {
        // code here
        if(S == null){
            return S;
        }
        String ans = "";
        String[] words = S.split("\\.");
        for(int i = words.length-1; i >=0; i--){
            ans += words[i]+".";
        }
        return ans.substring(0, ans.length()-1);
    }
}
