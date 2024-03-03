import java.util.HashMap;
import java.util.Map;

public class SocksMerchant {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3,3};
        findPairs(arr);
    }

    public static void findPairs(int[] arr){
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        int pairs = 0;
        for (Map.Entry<Integer,Integer> s : map.entrySet()){
            pairs = pairs + s.getValue()/2;
        }
        System.out.println(pairs);
    }
}
