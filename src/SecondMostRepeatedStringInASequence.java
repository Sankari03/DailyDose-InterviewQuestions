import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedStringInASequence {
    public static void main(String[] args) {
        int N = 6;
        String[] arr = {"aaa","bbb","ccc","bbb","aaa","aaa"};
        System.out.println(secFrequent(arr,N));
    }

    static String secFrequent(String[] arr, int N)
    {
        HashMap<String,Integer> map = new HashMap<>();
        for (String s: arr) {
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        int max = 0;
        int max2 = 0;
        String s1 =  "", s2="";

        for (Map.Entry<String,Integer> a: map.entrySet()) {
            if (a.getValue() > max){
                max2 = max;
                s2 = s1;

                max = a.getValue();
                s1 = a.getKey();
            } else if (a.getValue() > max2) {
                max2 = a.getValue();
                s2 = a.getKey();
            }
        }
        return s2;
    }
}
