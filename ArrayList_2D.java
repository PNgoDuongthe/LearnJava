package Array;

import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
       ArrayList<String> foodList = new ArrayList();
       foodList.add("Com");
       foodList.add("Banh mi");
       foodList.add("Pho");
       ArrayList<String> drinkList = new ArrayList();
       drinkList.add("Coffee");
       drinkList.add("Red bull");
       drinkList.add("Soda");
       ArrayList<String> vegetablesList = new ArrayList();
       vegetablesList.add("Carrot");
       vegetablesList.add("Watermelon");
       vegetablesList.add("zuckini");
       groceryList.add(foodList);
       groceryList.add(drinkList);
       groceryList.add(vegetablesList);
        System.out.println(groceryList);
    }
}
