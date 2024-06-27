package Array;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> VietnameseFood = new ArrayList<String>();
        VietnameseFood.add("Banh mi");
        VietnameseFood.add("Pho");
        VietnameseFood.add("Bun cha");
        VietnameseFood.add("Cha ca");
//        VietnameseFood.set(0,"Com");
//        VietnameseFood.remove("Cha ca");
//        VietnameseFood.clear();
        for(int i=0;i<VietnameseFood.size();i++)
        {
            System.out.println(VietnameseFood.get(i));
        }
    }
}
