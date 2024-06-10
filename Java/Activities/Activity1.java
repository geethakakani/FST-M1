package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car Hyundai = new Car();
        Hyundai.make = 2014;
        Hyundai.transmission = "Manual";
        Hyundai.color = "Black";
        Hyundai.displayCharacteristics();
        Hyundai.accelarate();
        Hyundai.brake();
    }
}

