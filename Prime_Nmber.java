import java.util.Scanner;

class Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n != 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Number is Prime :" + n);
            } else {
                System.out.println("Given Number is not prime number ");
            }
        } else {
            System.out.println("Number is not prime : " + n);
        }

    }
}