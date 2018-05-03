## Optional - Adding some Style

* Our storefront is not the most attractive in the world. (Nore will it be after this section). But let us add some CSS to that page.

1. First, add the following in the head tag (just below the title tag)  in our menu.html

```html
<link rel="stylesheet" href="/main.css" />
```

2. Then create a new file called main.css in the resource/static folder.
Add CSS to the file.

body {
    background-color: white;
}
```css
h1 {
    padding-top: 22px;
    padding-bottom: 22px;
    text-align: center;
    background-color: #4CAF50;
    color: white;
}

table {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #ddd;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}

tr:hover {
    background-color: #ddd;
}

th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
```

3. Done - Rerun the application and you should now have look to your storefront. (Marketing will be pleased!)

* [Next Exercise - Service Layer](../documents/exercise4.md)