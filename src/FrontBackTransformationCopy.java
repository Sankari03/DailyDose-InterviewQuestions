public class FrontBackTransformationCopy {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(copy(s));
    }

    public static String copy(String s){
        StringBuilder copy = new StringBuilder();
        int n = s.length();
        int diff;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                diff = c - 65;
                copy.append((char) (90 - diff));
            }else{
                diff = c - 97;
                copy.append((char) (122 - diff));
            }
        }
        return copy.toString();
    }
}
