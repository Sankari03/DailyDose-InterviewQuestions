public class ImplementStrStr {
    public static void main(String[] args) {
        String s = "abcabcabcd";
        String x = "cdab";
        System.out.println(strstr(s,x));
    }

    public static int strstr(String s, String x){
        int flag = 0;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x.charAt(0)){
                int l = i;
                for (int j = 0; j < x.length(); j++) {
                    if (l==s.length()-1 && s.charAt(l) == x.charAt(j)) {
                        index = i;
                    } else if (l==s.length()) {
                        index = -1;
                        return index;
                    }
                    if (s.charAt(l) == x.charAt(j)){
                        flag = 1;
                        l++;
                    }else{
                        flag = 0;
                        break;
                    }
                }
                if (flag==1){
                    index = i;
                    return  index;
                }
            }
        }
        return index;
    }
}
