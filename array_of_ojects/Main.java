package array_of_ojects;

public class Main {
    public static void main(String[] args) {
       Food food1 = new Food("Cơm tấm");
       Food food2 = new Food("Bánh ướt");
       Food food3 = new Food("Bún chả");
        Food[] fridge = {food1,food2,food3};
        System.out.println(food1.name);
        System.out.println(food2.name);
        System.out.println(food3.name);



    }
}
