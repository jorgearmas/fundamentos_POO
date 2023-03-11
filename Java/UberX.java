//Ubex se 'extidende' desde la clase padre 'Car'
public class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        //"super" hace referencia a la superclase de Car
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("\nModelo-> "+model+"\nMarca-> "+brand);
    }
}
