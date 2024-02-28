public class RemoveVowelsFromString {
    public static void main(String[] args) {
        System.out.println(removeVowels("Hello World!"));
    }
    static String removeVowels(String S) {
        return S.replaceAll("[aeiouAEIOU]", "");

    }
}
