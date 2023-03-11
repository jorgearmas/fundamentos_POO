
class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
            /*instanciacion objeto "car"*/
            UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AND123", "aherrera@uberd.com","generic123!"),"Chevrolet","Sonic");
            /*asignacion de datos de atributos de clase*/
            uberx.setPassenger(3);
            uberx.printDataCar();

            /*instanciacion objeto "car"*/
            Car car2 = new Car("QWE567", new Account("Baxter Cruz", "Liza Cruz","lcruz@uberd.com","generic123!"));
            /*asignacion de datos de atributos de clase*/
            //car2.passenger = 5;
            car2.printDataCar();

            User user1 = new User("Luke Mack", "LM785", "lmack@user.net", "pass123!");
            user1.printDataUser();

            Driver driver1 = new Driver("Maxi Rodriguez", "MR4156", "mrodriguez45@uberd.com", "generic1236!");
            driver1.printDataDriver();

    }
}