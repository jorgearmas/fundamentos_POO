public class Car {
    private Integer id;
    private String license;
    /*Account 'driver' hace referencia al atributo de tipo Account. 'driver' debe llenar los requisitos minismo del superconstructor de Account (name y document)*/
    private Account driver;
    /*Encapsulamiento del atributo passenger*/
    private Integer passenger;

    /*metodo constructor de Car, "this" hace referencia a las
     * variables globales*/
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    /*metodo que imprime datos de clase*/
    void printDataCar(){
        if (passenger != null){
            System.out.println("\nLicense-> "+license+"\nDriver-> "+driver.name+"\nCapacity-> "+passenger);
        }
    }

    /*get y set de atributo passenger*/
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        /*validacion de datos para passenger*/
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar cuatro pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
 
}
