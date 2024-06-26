package Method;

import java.util.Scanner;

public class Method_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value x: ");
        int x = scanner.nextInt();
        System.out.print("enter value y: ");
        int y  = scanner.nextInt();
        System.out.println(add(x,y));

    }
    public static int add(int x, int y){
        int z = x+y;
        return z;
    }
}
