import java.util.ArrayList;
import java.util.Map;


public class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    /*public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }*/

    /*Sobrescribir (polimorfirmo) a la regla del atributo passenger*/
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}