public class ClassObj1 {
    String carColor, carMake;
    int carYear;

    void Car() {
        System.out.println("Car color is " + carColor + " and car year is " + carYear + " and car model is " + carMake);
    }

    public static void main(String[] args) {
        ClassObj1 carPrint = new ClassObj1();
        carPrint.carColor = "Black";
        carPrint.carYear = 2019;
        carPrint.carMake = "BMW";
        carPrint.Car();

        carPrint.carColor = "White";
        carPrint.carYear = 2018;
        carPrint.carMake = "Toyota";
        carPrint.Car();
    }
}
