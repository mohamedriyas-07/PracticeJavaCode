package dear;

public class Reverseanumber {
    public static void main(String[] args) {
        int num = 56318;   // input number
        int reversed = 0;  // to store the reversed number

        while (num > 0) {
            int digit = num % 10;        // extract last digit
            reversed = reversed * 10 + digit;  // append digit to reversed
            num = num / 10;              // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
