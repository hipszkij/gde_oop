from CarFactory import CarFactory
from Sedan import Sedan

car_factory = CarFactory()

sedan = car_factory.create_car("sedan", "Toyota", "Yaris", "black", 2005)

sedan2 = Sedan("Toyota", "Yaris", "black", 2005)

print(sedan)
print(sedan2)