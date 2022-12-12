public class Swap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("a Before Swapping " + a);
        System.out.println("b Before Swapping " + b);
        int temp;

        // with using Third variable
        temp = a;
        a = b;
        b = temp;
        System.out.println("a After Swapping " + a);
        System.out.println("b After Swapping " + b);

        // without using Third variable

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a After Swapping " + a);
        System.out.println("b After Swapping  " + b);

    }
}
