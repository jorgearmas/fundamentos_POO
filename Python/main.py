from car import Car

if __name__ == "__main__":
    print("Hola Mundo")

#instanciacion de objeto "car"
car = Car()
#asignacion de datos a atributos de clase
car.license = "AMS985"
car.driver = "Andres Herrera"
print(vars(car))

#instanciacion de objeto "car2"
car2 = Car()
#asignacion de datos a atributos de clase
car2.license = "QSQ452"
car2.driver = "Cookie Cruz"
print(vars(car2))