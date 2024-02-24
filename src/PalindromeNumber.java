public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 555;
        System.out.println(is_palindrome(n));
    }
    public static String is_palindrome(int n)
    {
        int ref = n;
        int rev = 0;

        while(n > 0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }

        if(rev == ref){
            return "Yes";
        }else{
            return "No";
        }
    }
}
