package Method;

public class Overload_Method {
    public static void main(String[] args) {
//
        System.out.println(add(2.0,3.0,4.0,5.0));
    }
    public static int add(int a, int b){
        System.out.println("this is first method");
        int z = a+b;
        return z;
    }
    public static int add(int a,int b,int c){
        System.out.println("this is second method");
        int z = a+b+c;
        return z;
    }
    public static int add(int a,int b,int c,int d){
        System.out.println("this is third method");
        int z = a+b+c+d;
        return z;
    }

    public static double add(double a,double b){
        System.out.println("this is four method");
        double z = a+b;
        return z;
    }
    public static double add(double a,double b,double c){
        System.out.println("this is fifth method");
        double z = a+b+c;
        return z;
    }
    public static double add(double a,double b,double c,double d){
        System.out.println("this is six method");
        double z = a+b+c+d;
        return z;
    }



}
