class account:
    id = int
    name = str
    document = str
    email = str
    password = str

    """
    Metodo Constructor:
    La palabra self hace referencia a las
    variables globales. Ingresa como parametro
    """
    def __init__(self, name, document):
        self.name = name
        self.document = document