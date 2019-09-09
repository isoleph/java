# Lists in Java

Lists in java are a little complex. In Java, it might be instructive to think of everything you see as a class or some instance of a class. 

In order to create a list in java, you have to use a declaration much like you might see in C++. Let's take a look in more detail of how to create a list in java. 

```java
List<Integer> N = new ArrayList<Integer>(4);
Collections.addAll(N, 5, 10, 15, 20);
```

Notice that to create the list `N`, we needed to make memory from the heap using the `new` declaration. We also had to specify the data type that the list will contain using the brackets `<Integer>`. Then we use the special `ArrayList` function to create an integer list with 4 items in this example.

In order to extract an element from the list, we used the `.get(0)` method for the list we made. If you want to replace this later on, you would use the `.set(0)` method instead.

Bear in mind that a lot of methods and important utilities were imported at the top using the line `import java.util.*;`. It might be good to make sure that you have all the tools on your table when you're writing in Java. 
