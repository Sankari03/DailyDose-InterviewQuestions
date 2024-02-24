public class ArmstrongNumber {

    public static void main(String[] args) {
        int n= 153;
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n){
        int copy = n;
        int sum = 0;
        int digit = (int)Math.log10(n)+1;

        while(n > 0){
            int rem = n%10;
            sum += Math.pow(rem, digit);
            n/=10;
        }

        if(sum == copy){
            return "Yes";
        }else{
            return "No";
        }
    }
}
