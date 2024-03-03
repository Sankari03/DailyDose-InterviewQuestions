public class MaxSignal {
    public static void main(String[] args) {
        String s = "100111001";
        System.out.println(maxSignal(s));
    }

    public static int maxSignal(String s){
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '1'){
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
