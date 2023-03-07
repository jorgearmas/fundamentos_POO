public class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        //"super" hace referencia a la superclase
        super(license, driver);
    }
}
