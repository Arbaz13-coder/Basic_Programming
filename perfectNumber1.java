public class perfectNumber1 {

    public static void main(String[] args) {

        // Perfect Number program
        int n = 6;
        int sum = 0;
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0) {
                sum = sum + j;
            }
        }
        if (sum == n) {
            System.out.println("Given number is perfect " + sum);
        } else {
            System.out.println("Given Number is no Perfect");
        }

    }
}
