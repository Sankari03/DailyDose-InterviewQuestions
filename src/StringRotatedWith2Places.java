public class StringRotatedWith2Places {
    public static void main(String[] args) {
        String s1="amazon";
        String s2 = "azonam";
        System.out.println(isRotated(s1,s2));
    }
    public static boolean isRotated(String str1, String str2)
    {
        String antiClk1 = str1.substring(0,2);
        String antiClk2 = str1.substring(2);

        String clk1 = str1.substring(str1.length()-2);
        String clk2 = str1.substring(0, str1.length()-2);

        return(((antiClk2 + antiClk1).equals(str2))||((clk1 + clk2).equals(str2)));
    }
}
