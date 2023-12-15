package basics;

public class Basics {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x + y;
        System.out.println("x + y = " + z);
    }
}
