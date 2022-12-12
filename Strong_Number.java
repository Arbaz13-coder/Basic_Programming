public class Strong_Number {
    public static void main(String[] args) {

        int sum = 0;
        int num = 145;
        int temp = num;

        while (num != 0) {
            // to find last digit from given number
            int rem = num % 10;

            // to get Factorial of which you find last digit
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;

            }
            // Add Facorial to sum .
            sum = sum + fact;
            // to find remove last digit from given number
            num = num / 10;

        }
        if (sum == temp) {
            System.out.println("given number is strong " + sum);

        } else {
            System.out.println("Giver Number is not a Strong Number ");
        }
    }
}
