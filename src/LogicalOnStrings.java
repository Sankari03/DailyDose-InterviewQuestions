public class LogicalOnStrings {
    public static void main(String[] args) {
        String s = "1A0B1";
        System.out.println(logicalOfString(s));
    }

    public static int logicalOfString(String s){
        int ans = s.charAt(0)-48;
        for (int i = 1; i < s.length() ; i+=2) {
            if (s.charAt(i) == 'A'){
                ans = ans & (s.charAt(i+1)-48);
            }else if (s.charAt(i) == 'B'){
                ans = ans | (s.charAt(i+1)-48);
            }else{
                ans = ans ^ (s.charAt(i+1)-48);
            }
        }
        return ans;
    }
}
