package Arrays;

public class Array {
    public static void main(String[] args) {

        String[] Cars = {"Honda","Toyota","Volvo","BMW" };
        Cars[3] = "Maybach";
        System.out.println(Cars[3]);
        // array store mutiple values
        String[] cars = new String[4];
        cars[0]= "Honda";
        cars[1]= "Volvo";
        cars[2]= "Maybach";
        cars[3]= "Kia";
        for (int i =0;i< cars.length;i++)
        {
            System.out.println(cars[i]);
        }
    }
}
