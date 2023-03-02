from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

#instanciacion de objeto "car"
car = Car("AMS", Account("Andres Herrera","ANDA876"))
print(vars(car))

#instanciacion de objeto "car2"
car2 = Car("QSQ452", Account("Cookie Cruz","YPF7456"))
print(vars(car2))