package recursion;

/**
 * Author: Sergey.
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(Recursion.sum(3));
//        StackCall.greet("Sergey");
//        countSum();
    }

    private static void countSum() {
        int sum = Recursion.sum(new int[]{1,2,3,4,5});
        System.out.println(sum);
    }
}
