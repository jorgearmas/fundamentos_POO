from car import Car
from account import Account
from user import User

if __name__ == "__main__":
    print("Hola Mundo")

#instanciacion de objeto "car"
car = Car("AMS", Account("Andres Herrera","ANDA876","aherrera@uber.com","pass123"))
print(vars(car))

#instanciacion de objeto "car2"
car2 = Car("QSQ452", Account("Liza Cruz","YPF7456", "lcruz@uber.com", "pass123"))
print(vars(car2))

#instanciacion de objeto "user"
user = User("Jose Garcia", "JGAR968", "jgarcia@sample.net", "pass123")
print(vars(user))