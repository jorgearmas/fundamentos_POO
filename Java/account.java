public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    /*metodo constructor de Account, "this" hace referencia a las
     * variables globales*/
    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }
}
