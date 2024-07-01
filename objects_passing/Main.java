package objects_passing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("Honda");
        Car car2 = new Car("Volvo");
        Car car3 = new Car("Roll Royce");
        garage.Garage(car);
        garage.Garage(car2);
        garage.Garage(car3);
    }
}
