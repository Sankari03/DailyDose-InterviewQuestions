public class SuperASCIIChecker {
    public static void main(String[] args)
    {
        String s = "bba";
        checkSuperASCII(s);
    }
    public static void checkSuperASCII(String s)
    {
        int[] b = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            int index = (int)s.charAt(i) - 97;
            b[index]++;
        }
        for(int i = 0; i < s.length(); i++)
        {
            int index = (int)s.charAt(i) - 97;
            if (b[index] != index+1)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

