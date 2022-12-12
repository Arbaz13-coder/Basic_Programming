public class Palindrome {

    public static void main(String[] args) {

        int n = 12345321;
        int rev = 0;
        int temp = n;

        while (temp > 0) {

            // to get Last Digit
            int rem = temp % 10;

            // to store the reverse number
            rev = rev * 10 + rem;

            // to remove Last Digit
            temp = temp / 10;

        }
        if (n == rev) {
            System.out.println("Number is palindrome ");
        } else {
            System.out.println("Number is Not Palindrome ");
        }

    }
}
