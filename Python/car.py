from account import Account

class Car:
    id = int
    license = str
    #driver se declara como tipo Account
    driver = Account("","")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
