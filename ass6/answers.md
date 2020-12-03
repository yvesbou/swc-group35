answers.md to exercise 2

Requirements of ShoppingPlatform:
Requirements are that the ShoppingPlatform has a SearchBar, UserProfiles and Products.
The ShoppingPlatform has the responsibility to provide functions that the UserProfile can interact with the ShoppingPlatform nameingly login, checkout and leavePlatform. 

Requirements of the SearchBar:
It has to be able to search the list of Products but it's not the SearchBar's requirement to store the Products. Therefore, it has to access the Products via the ShoppingPlatform instance. SearchBar needs a list of products that will be shown to the user (shownProducts).
A SearchBar has the responsibility to search the Products in the ShoppingPlattform hence it has the method searchAll which performs that.
It has two methods which implement the filter requirements FilterByCategory and FilterByType.



Requirements of the Product:
The requirements demanded that the Products are divided into distinct
categories nameingly Shoes and Clothes. Whereas shoes are also divided into boots and sneakers, and clothes are divided into dresses, shirts and trousers. This is also a “is-kind-of” relationship hence we decided to implement this relationship with inheritance. These classes exists since the SearchBar needs to be able to filter a Product list by categories and types.
Product has to provide the following attributes: price, size, color and name.
Product must have a setter for the price since products can be repriced when sold by a UserProfile.


Requirements of AllProducts:
We decided also to include AllProducts because we learned that information should be stored in one place by one class and also it is not exactly the requirement of the ShoppingPlatform to handle the product data. AllProducts is the whole and a Product is a part thus AllProducts is an aggregate of Products.

Requirements of the UserProfile:
The requirements stated that a UserProfile can belong to one of three levels. This is an "is-kind-of" relationship therefore normal customer, gold customer and platinum exist as distinguishable classes and each extends the abstract UserProfile. Those three have the field simultaneous sells which determines the number of products they can sell at the same time. This is not the responsibility of the UserProfile to provide this field.
A UserProfile has to be able to pay with a PaymentMethod <<interface>>. The relationship between the UserProfile and the PaymentMethod is that the first uses the latter.
Every user is required to have its own Cart thus the UserProfile has an instance of Cart and the UserProfile can navigate to it. The UserProfile can also navigate to the ShoppingPlatform because it needs to access the functions leavePlatform, login, checkout of the ShoppingPlatform those are called in the login, checkout and leave function of the UserProfile. These UserProfile functions are required because a user can perform this actions. UserProfile has to be able to search the Products, hence it uses the instance of SearchBar to search (method) the list of Products.
UserProfile is required to have a sell method and a buy method. 

Requirements of PaymentMethod:
A PaymentMethod is a concept thus we decided to make it an interface, the concrete classes Invoice, DebitCard, CreditCard, BankTransfer implement the interface. It has a method pay which is required for the specific paymentMethods nameingly Invoice, DebitCard, CreditCard, BankTransfer. 
It is required for the interaction between two UserProfiles concerning a transaction.


Requirements of Cart:
A cart has the requirement to add or remove products therefore it has a list of products and two methods add and remove.
