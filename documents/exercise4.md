# Exercise 4 - Service Layer

## In the last exercise, we displayed our coffee store name, by populating the attribute directly in the controller.  Let us now introduce a service layer and add some a models to represent our coffee stores. To wrap it up, we will use that service layer to populate our attributes.

1. Create a new package called model.
2. In the model package, create a new Java Class called coffee.
   * Add the following types
     * Id (Long)
     * Name (String)
     * Description (String)
     * price (BigDecimal)
   * Then add the getters and setters.
3. Also in the model package create a new Java Class called Store
   - Add the following types
     - Id (Long)
     - Name (String)
     - List of Coffee Stores.
     - Add the getters and setters.
4. Create our CoffeeStoreService class in a newly created package called "services".
5. Annotate the CoffeeStoreService class with the @Service annotation.
6. Add a new method called 
```
public CoffeeStore getCoffeeStoreById(Long id) 
```
7. Implement the login in the getCoffeeStoreById method. At this stage, just return single coffee store with a selection of coffees. (Ignore the id for now)

8. Go back to your Controller
* Autowire in your previously created service. (Remember to use Constructor injection)
*  In you showCoffees method. Use the service and call the getCoffeeStoreById (with any id). Store the result in a local variable called "store".
* Populate the model's attributes now local variable.  It should look something like:
```
model.addAttribute("coffeeStoreName", store.getName());
```
* Lastly add a new attribute named "coffees" and populate it with the 
```
store.getCoffeeList()
```

9. You can now also update your menu.html file to display all the coffees.

Here is a sneak peek at the HTML you might need. 

```
<table>
        <thead>
        <th> Menu </th>
        <th> Description </th>
        <th> Price </th>
        </thead>
        {{#coffees}}
        <tr>
            <td> {{name}} </td>
            <td> {{description}} </td>
            <td> {{price}} </td>

        </tr>
        {{/coffees}}
    </table>
```

[Next Exercise](../documents/exercise5.md)