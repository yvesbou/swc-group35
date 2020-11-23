##Exercise2
###Design pattern:

####How:
The different Cars (Bus, FamilyCar, Supercar,MicroCar) implement a common interface named Vehicle.
There exists an abstract class Customer. This class contains all the functionality 
of the customers. It contains also a field of type Vehicle. The classes derived 
from Customer (BusCustomer, FamilyCarCustomer, MicroCarCustomer, SupercarCustomer)
set the field of Type vehicle. So they chose any type of vehicle and vehicles can be easily
added or removed. 

####Why:
If we want to add more Vehicles in the future or remove some obsolete ones, this 
can be easily done, using the strategy design pattern.