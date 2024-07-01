package toString_Method;

public class Car {
    String symbol = "Honda";
    String model ="CRV";
    String color = "Black";
    int year = 2022;
    public String toString(){
        String myString = symbol+"\n"+model+"\n"+color+"\n"+year+"\n";
        return myString;
    }
}
