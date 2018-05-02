# Exercise 3 - a Custom Page

In the last exercise, we got the ViewResolver just to resolve to the default landing page. This time let us create a custom page with a message populated by the back end.

1. Create a new java package called: "web".
2. In the package create a new Java class called CoffeeController
3. Add the @Controller annotation to the class
4. Create a method with called showMenu that returns a String and accepts has one parameter of type Model.
Then annotate the method with the @GetMapping("coffee/menu") annotation

When done it should look something like.
```java
@GetMapping("coffee/menu") 
public String showCoffees(Model model) {
    return "menu"; 
}
```
**  "menu" is the name of the view that will be looked up by the view resolver.

5. Next, we need to add that custom message we wish to display. In this case, it will be the Coffee Store's name. 
To achieve this, we simply add the name as an attribute to the model. Like this:
```java
  "model.addAttribute("coffeeStoreName","StarDucks");"
```

6. Now we are ready to add the custom page.
We know that the name of the page should be "menu", (that the view name we return from the controller)  Create Next, create menu.html in the templates folder.

7. Paste the following HTML into the file.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Coffee Store</title>
</head>
<body>
    <h1>{{coffeeStoreName}}</h1>
</body>
</html>
```
You will notice that this is not JUST HTML. There is also the mustache's syntax between the h1 tags. During the rendering phase, this will be replaced by the attribute "coffeeStoreName" that we added to the model. 

8. You can now re-run the application and browse to "http://localhost:8080/coffee/menu".  You should see a white page with the title of your coffee store.


