# Bonus sections

## When you are done with all the exercises, Pick some of the following features to add - 

### Validation
* Add some validation, when creating a coffee

### Update
* Edit a Store Name
* Edit the Coffee 

### Delete
* Delete a coffee
* Delete a store

### Exception Handling
* Provided a fall back page when encountering an exception. Look @ https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc

### More of the same
* Each store now wish to have a loyal customer list. 
    * Create a new entity called Customer
    * Add them to Store Entity
    * Create two pages, one to add customers to a store
    * One to view the Customers per store. 
    
### Advance Menu
* Create functionality the will display a certain coffee special only during a specific time slot.
    * Add a field to your Coffee Entity active From and Active To (LocalDateTime) 
    * Filter the result when retrieving the coffee store, to only include the valid coffees
 
### Advance
* Provide a RestFul API for your coffee store menu managing system. (Have a look at @RestController)
* Use Spring's RestTemplate to retrieve a list of coffee name from https://api.myjson.com/bins/1cs2d6
    * Use this when creating a coffee, instead of a text box to insert the name, have a drop-down box.
 