from account import account

class Car:
    id = int
    license = str
    driver = account("","")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
