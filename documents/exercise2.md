# Excercise 2 - Hello World
## Creating a Landing Page.
## In the section we will setup mustache templating and create a landing page for our application.
To start using mustache templating, we need to add another dependency 
1. Located in your project root is a pom.xml file. Add to the dependencies tag the following:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mustache</artifactId>
</dependency>
```
** Intelij will prompt you with a message: "Maven projects need to be imported:" Choose the "Enable Auto-Import" option.

2.  Now we need to tell the View Resolver where it can find - All you need to do for this is add the following properties to your application.properties (located at: src->main->resources)
```
 spring.mustache.prefix=classpath:templates/
 spring.mustache.suffix=.html
```
3. Add a file called index.html to the templates folder located at src->main->resources->templates

Add the following HTML:

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Tutorial</title>
</head>

<body>
    <h1>Coffee Store Inc.</h1>
</body>

</html>
```
4. Run your application ( Main method located in TutorialApplication ). Check the log everything should start without a problem. You should see the following line:
"FrameworkServlet 'dispatcherServlet': initialization completed in..."

5. In any browser, browse to http://localhost:8080/. You should see the text "Hello World" display.

[Next - Displaying a Store Name](../documents/exercise3.md)
