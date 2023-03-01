
class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
            /*instanciacion objeto "car"*/
            Car car = new Car();
            car.license = "AMQ123";
            car.driver = "Andres Herrera";
            car.passenger = 4;
            car.printDataCar();

            /*instanciacion objeto "car"*/
            Car car2 = new Car();
            car2.license = "QWE567";
            car2.driver = "Cookie Cruz";
            car2.passenger = 5;
            car2.printDataCar();
    }
}