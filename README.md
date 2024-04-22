Simple E-Commerce System 




Welcome to the Simple E-Commerce System project! This system models different types of products and their interactions with customers through a set of classes. Below is an overview of the classes and their functionalities:

Class Overview




Product: Represents a generic product with attributes like productId, name, and price.
ElectronicProduct: Subclass of Product representing electronic products, with additional attributes like brand and warrantyPeriod.
ClothingProduct: Subclass of Product representing clothing products, with additional attributes like size and fabric.
BookProduct: Subclass of Product representing book products, with additional attributes like author and publisher.
Customer: Represents a customer with attributes like customerId, name, and address.
Cart: Represents a shopping cart for a customer, containing an array of Product objects and methods to manage the cart.
Order: Represents an order placed by a customer, containing information about the customer, products ordered, and total price.
EcommerceSystem: Serves as the entry point for the project, demonstrating the usage of other classes and interacting with the user to create products and place orders.
Test Case
To test the functionality of the system, follow these steps:

Create an electronic product with the given specifications.
Create a clothing product with the given specifications.
Create a book product with the given specifications.
Create a customer with your data (input from the user).
Create a shopping cart for the customer and add products to it (input from the user).
Ask the user if they want to place an order for the products in the cart.
Print the order information.
