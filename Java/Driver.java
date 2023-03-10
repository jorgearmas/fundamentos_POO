public class Driver extends Account {
    public Driver (String name, String document, String email, String password){
        super(name, document, email, password);
    }

    public void printDataDriver(){
        System.out.println("\nName-> "+name+"\nDocument-> "+document+"\nEmail-> "+email+"\nPassword-> "+password);
    }
    
}
