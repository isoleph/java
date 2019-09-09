# Factorial Function 

Let's create a function that determines the factorial of an integer number. We can do this by using a for-loop with Java. Look at the following code: 

```java 
public static int fact(int n) {
    int result = 1;
    for(int i = 1; i<=n; i++) {
        product *= i;
    }
    return product;
}
```

Notice that we declared an integer that we would multiply with the for-loop and then we iterated over values of `i` until we reached our desired number `n`. This way is very reminiscent of C++, except with more classes everywhere.
