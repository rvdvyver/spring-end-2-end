# Exercise 8 - Add some Coffee
## This the final part of our "requirements". In this part, we will add some coffees to a specific coffee store.

1. Same as previously, we need a DTO to get the information for the request.
* Create a DTO in the web package called CoffeeDto
* It should contain the following fields name (String), description (String) and price (double)
2. Next, in our service, we need a new method. 
* Create method with this signature: 

```
public void saveCoffeeToStore(Long storeId, CoffeeDto coffeeDto)
```

* You will need to implement the logic - 
    * First retrieve the store with the storeId
    * Create the coffee with information from the coffeeDto
    * Add the coffee to the store
    * Save the result

3. Now it is time to update the controller.
* Like previously, we need two endpoints, Use "coffee/{storeId}/addCoffee" for the mappings 
    * A endpoint for navigating us to the new add coffee page (GET)
    * A endpoint for actually saving the coffee (POST)
* Create both of the endpoints. For the saving the coffee method, use the following method signature 
```
public String addCoffeeToStore(@ModelAttribute CoffeeDto coffeeDto, @PathVariable("storeId") Long storeId)
```

4. On the page where you display all the coffee stores. Add a link to each store to add a coffee for that store.

* This HTML might be handy
```
 <a href="/coffee/{{id}}/addCoffee"> Add Coffee </a> 
```
5. Now, create a page to add a coffee to the store. Take into consideration what logical view name you returned from your endpoint. Ensure your names in your DTO matches those in your form.
* This one is pretty much up to you. (No sneak peak this time)

6. That is it. Run your application add some coffee to a store and see that menu is populated successfully.

7. Congratulations - You finished creating your Coffee Store Menu Management System. Next, try some requirements from the Bonus Section.
 
8. [NextBonus](../documents/bonus-section.md)