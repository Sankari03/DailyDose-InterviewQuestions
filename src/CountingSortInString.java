public class CountingSortInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(countSort(s));
    }
    public static String countSort(String arr)
    {
        // code here
        int[] let = new int[26];
        int n = arr.length();
        for(int i = 0; i < n; i++){
            int temp = (int)arr.charAt(i)-'a';
            let[temp]++;
        }
        StringBuilder ans = new StringBuilder();
        int m = let.length;
        for(int i=0; i< m; i++){
            for(int j = 0; j < let[i]; j++){
                ans.append((char) (i + 97));
            }
        }

        return ans.toString();
    }
}
