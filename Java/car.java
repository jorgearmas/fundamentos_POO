public class Car {
    Integer id;
    String license;
    /*Account 'driver' hace referencia al atributo de tipo Account. 'driver' debe llenar los requisitos minismo del superconstructor de Account (name y document)*/
    Account driver;
    Integer passenger;

    /*metodo constructor de Car, "this" hace referencia a las
     * variables globales*/
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    /*metodo que imprime datos de clase*/
    void printDataCar(){
        System.out.println("License: "+license+" / Driver: "+driver.name+" / Capacity: "+passenger);
    }
}
