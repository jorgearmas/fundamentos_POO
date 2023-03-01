
class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
            /*instanciacion objeto "car"*/
            Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
            /*asignacion de datos de atributos de clase*/
            car.passenger = 4;
            car.printDataCar();

            /*instanciacion objeto "car"*/
            Car car2 = new Car("QWE567", new Account("Baxter Cruz", "Cookie Cruz"));
            /*asignacion de datos de atributos de clase*/
            car2.passenger = 5;
            car2.printDataCar();
    }
}