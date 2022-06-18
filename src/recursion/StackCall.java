package recursion;

/**
 * Author: Sergey.
 */
public class StackCall {

    public static void greet(String name){
        System.out.println("hello, " + name + "!");
        greet2(name);
        buy();
    }

    private static void buy() {
        System.out.println("buy");
    }

    private static void greet2(String name) {
        System.out.println("How are you, " + name + "?");
    }
}
