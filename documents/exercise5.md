## Exercise 5 - Retrieve Something

1. Update the Entities
* To both of our domain model objects (Coffee and CoffeeStore) add the following annotation on class level.
```
@Entity
```
 * Also for both of classes add the following annotation to the id field.
```
 @Id
 @GeneratedValue
```
* Lastly, annotate the coffeeList field in the CoffeeStore class with
```
@OneToMany(cascade = CascadeType.ALL)
```
2. Create the repository
* First create a new package called "repository"
* In the package create a new interface CoffeeStoreRepository, it should extend from the JpaRepository
* In the end, it should resemble something like
```
public interface CoffeeStoreRepository extendsJpaRepository<CoffeeStore, Long>
```
* That is it - we do not need to add anything else to the interface.
3. Populate the database. 
* When starting up the database we need some test data. For this exercises, an easy way to populate the database is the use of @PostConstruct annotation. This tells Spring to execute a specific method after the bean has been created.
Create a new method in the CoffeeStoreService - 
```
  @PostConstruct
    public void populateDatabase() {
    }
```
* Move the code that is currently in the getCoffeeStoreById method to the populateDatabase method. Instead of returning an instance, now use the following method to store the newly created coffee store.
```
coffeeStoreRepository.save(coffeeStore);
```

4. Use the repository in Service Layer
* Inject the newly created CoffeeStoreRepository into our CoffeeStoreService
* Update our getCoffeeStoreById method to now use that service
* Tip: Use the findById(id) method that is available in the coffeeStore repository. 
5. Update the controller to retrieve a store by id
* We now just need to update our Controller to use the id, instead of a hardcode store.
* Change the signature of the showCoffees method in your controller to: 
```
    public String showCoffees(Model model, @PathVariable("id") Long id) {
```
* Also change the GetMapping annotation to 
```
@GetMapping("coffee/{id}/menu")
```
* Then use the id parameter instead of the hardcode id value to retrieve the store.

6. Run the application and take note that the URL also changed now.
Browse to http://localhost:8080/coffee/1/menu, you should see the coffee store that was retrieved from the database. **Congratulations! You created an End to End Spring Application!** 

7. Now it is your turn to take the steering wheel. For the last step(s) Implement a new page that will return all the shop names. 
* You need to create your own HTML page, 
* Add a method in your controller to resolve that page.
* Add the attributes to the page.
* Add a new method in your service layer that returns all the stores. (Tip: Use the coffeeStoreRepository.findAll() method)


[Next Exercise](../documents/exercise5.md)