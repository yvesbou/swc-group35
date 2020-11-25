Composite Design Pattern:
Why: We decided to use the composite design pattern for the company structure,
since it has to be easily extendable upon desire. Imagine some branches of the company have deeper hierarchy than others.
The composite design pattern accounts for that.
It enables to give the entities the same functions and when needed they can be modified.
How: We have an abstract class as parent, which we call Facility, since it can be a shop, an office, whatever the company will build/buy in the future.
Two child classes extend the facility class which we decided to have abstract too, since they are just concepts. We have
different type of Bakeries and different types of offices. One could argue to call Bakery just shop to make it more generic description,
but for now it seemed okay. The actual Bakeries are then NormalBakery, SweetsOnlyBakery and the BreadOnlyBakery.
The actual implementation of the office interface are in our case the CityOffice and the CentralOffice.
Decorator Design Pattern:
Why: For the bread/sandwich as well as the cake we used the decorator design pattern.
This makes sense when one recalls the functionality these products should have.
They should be easily decorated with toppings or fillings, making the 
decorator design principle a perfect fit.
How: We have a parent abstract class for the cake and for the sandwich. Then we have for each
product a decorator which is the parent class of the possible toppings/fillings. Moreover, the cake/sandwich
is extended by the rawCake/rawBread. We decided to have the abstract bakery implementing the full set of functions and
the specialized bakeries to overwrite the functions they do not support with selfmade exceptions.
This exceptions are not handled by the company since it's not their responsibility but they
have to be handled by consumers we had not to implement. Therefore, we just wrote try and catch within
the main and some messages they make sense in this setting.

