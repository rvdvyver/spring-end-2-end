# Exercise 7 - Add some Stores - Now at Runtime
## In this exercise you will be creating a new page to add stores. 

1. First, you need to add a new method to our controller to resolve to our new view. Use a getMapping with the value "coffee/addstore".
Let the method return the logical view name called "add_store".
This is more or less the same what we did in the previous exercise, but we do not need to populate the model. (No need to have that parameter in the method signature) 

2. Now create a new Save Store Page (add_store.html). The following HTML will come in handy.
 ```
<form method="post" action="/coffee/addstore">
        <input type="text" name="name" placeholder="Store Name"> </input>
        <button type="submit"> Save the Store </button>
    </form>
```
3. Also, we need to add a link to navigate to store adding page.
The following HTML should be added somewhere appropriate. 
```
<a href="/coffee/addstore"> (Add a Store) </a>
```
4. Next, create a save method in Service Layer. The signature should match the following. 
```
 public void saveCoffeeStore(String name)
```

4. Add a new endpoint in the controller to handle a post request. 
* Just before we create the endpoint, we also need to create a DTO (Data Transfer Object). In the web package create a CoffeeStoreDto with a single field (Remember the getters and setters) -
```
String name;
```

* Next, let us add that new endpoint in the controller.
```
    @PostMapping("coffee/addstore")
    public String addStore(@ModelAttribute CoffeeStoreDto storeDto) {
        coffeeStoreService.saveCoffeeStore(storeDto.getName());
        return "redirect:/coffee";
    }
```
 
5. You should now be able to navigate to the add store page and a store. The store should then appear in the list of all stores.

6. [Next Exercise - Add some Coffee](../documents/exercise8.md)