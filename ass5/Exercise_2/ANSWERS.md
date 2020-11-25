##Exercise2
###Design pattern:

####How:
The different Cars (Bus, FamilyCar, Supercar,MicroCar) implement a common interface named Vehicle.
There exists a class Customer. This class contains all the functionality 
of the customers. A customer has a ride method, which takes an instance of Type vehicle
as input. So the concrete Vehicle implementation is encapsulated from the Customer.

####Why:
If we want to add more Vehicles in the future or remove some obsolete ones, this 
can be easily done, using the strategy design pattern.