package Overload_Constructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust","tomato","mozarella","sausage");
        System.out.println("this is your ingredient in pizza ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
