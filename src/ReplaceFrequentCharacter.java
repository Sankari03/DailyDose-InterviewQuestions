public class ReplaceFrequentCharacter {
    public static void main(String[] args) {
        String word = "accle";
        char replace = 'p';
        replaceFrequent(word, replace);
    }

    private static void replaceFrequent(String word, char replace) {
        int[] arr = new int[26];
//
//        for (int i = 0; i < word.length(); i++) {
//            int index = (int)word.charAt(i)-97;
//            arr[index]++;
//        }
        
        int maxCount = 0;
        char maxChar = 0;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            arr[index]++;
            if (arr[index] > maxCount) {
                maxCount = arr[index];
                maxChar = c;
            }
        }

        System.out.println(maxCount);
        System.out.println(maxChar);
        if(maxCount > 1) {
            String replace1 = word.replace(maxChar, replace);
            System.out.println(replace1);
        }else{
            System.out.println(word);
        }

    }
}
