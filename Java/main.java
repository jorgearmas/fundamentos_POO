
class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

            UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AND123", "aherrera@uberd.com","generic123!"),"Chevrolet","Sonic");
            uberx.setPassenger(4);
            uberx.printDataCar();

            UberVan uberVan = new UberVan("FDQ23D", new Account("Luis Garcia", "LG466", "lg@mail.com", "123!"));
            uberVan.setPassenger(6);

            User user1 = new User("Luke Mack", "LM785", "lmack@user.net", "pass123!");
            user1.printDataUser();

            Driver driver1 = new Driver("Maxi Rodriguez", "MR4156", "mrodriguez45@uberd.com", "generic1236!");
            driver1.printDataDriver();

    }
}