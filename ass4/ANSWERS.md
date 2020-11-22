##Design Choices

####Technician:
We decided to make an interface for the Technicians:
WebTechnician and BackendTechnician. We decided to make an interface,
instead of using inheritance, because the WebTechnician and BackendTechnician have
no common functionality apart from getters and setters.
####Employees:
We decided, that the abstract Class BankEmployee is the parent class
of The RegularEmployee and the RegularEmployee is the parent class of
the SectionChief and the SectionChief is the parent class of the Main_Ex2 Chief.
We decided use inheritance here, because almost all methods of the parent
are also used in the child. MainChief for example can use the upgrade and
downgrade functions of his ancestors. BankEmployee is a BaseClass, which
contains functionality for the child classes. 
It is not a real Employee, therefore it should not be allowed
to make an instance of it and therefore we decided to make it abstract.

####CreditCards:
CreditCard is a Parent Class of the following Classes:
*CreditCardRegular
*CreditCardGold
*CreditCardPlatinum

All CreditCards have many common methods. Therefore, we 
decided to make the Class CreditCard, from which

* CreditCardRegular
* CreditCardGold
* CreditCardPlatinum
can inherit their methods. 

we made CreditCard and abstract class for two reasons:
* CreditCard should not be instanciated, because it has no level and no limit
* we decided to make the method setLimit a prototype, so every child class must define it with the correct limit

####CreditCardValidation, ChiefOfStaff, CustomerSystem
We made the following three helper Classes:
* CreditCardValidation
* ChiefOfStaff
* CustomerSystem

Those three classes are to ensure, that customerIDs, cities of Section chiefs
and similar IDs are unique.

We decided to implement this functionality using static class methods and
class attributes instead of Singletons, because it less code and has no caveats
in this context. We declared all three of them as abstract, to ensure that
no instances are created, because they would have no functionality.

####Customers

The Customers are organised as follows: an instance of type Customer is created
once. This instance holds the fields for variables, that do not change during
up- or downgrade. Additionally, a RegularCustomer, GoldenCustomer or PlatinumCustomer
has to be created. This holds Customer holds the credit Card. StatusCustomer
is the parent of RegularCustomer, GoldenCustomer and PlatinumCustomer and
contains common funcitionality of the three levels of customers.
We made the Statuscustomer, because RegularCustomer, GoldenCustomer and PlatinumCustomer
have much common methods. StatusCustomer is declared abstract, because there is no level
or CreditCard associated with StatusCustomer and therefore no intance should be created of StatusCustomer.

