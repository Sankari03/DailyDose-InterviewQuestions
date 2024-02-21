import java.util.HashMap;

public class KeyPair {
    public static void main(String[] args) {
        int N = 3, X = 6;
        int[] arr = {1,3,4};
        System.out.println(hasArrayTwoCandidates(arr,N,X));
    }
    static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashMap<Integer, Integer> s = new HashMap<>(n);
        for (int i: arr) {
            if (s.containsKey(i)){
                s.put(i, s.get(i)+1);
            }else {
                s.put(i, 1);
            }
        }
        System.out.println(s);
        for (int i = 0; i < n; i++) {
            int diff = x - arr[i];
            if (diff == arr[i]){
                if (s.get(diff) > 1){
                    return true;
                }
            }else{
                if (s.containsKey(diff) && s.get(diff) >=1){
                    return true;
                }
            }
        }
        return false;
    }
}
