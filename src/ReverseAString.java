public class ReverseAString {

    public static void main(String[] args) {
        System.out.println(reverseWord("GeeksForGeeks"));
    }

    public static String reverseWord(String str)
    {
        String ans ="";
        for(int i= str.length()-1; i >=0; i--){
            ans+=str.charAt(i);
        }

        return ans;
    }
}
