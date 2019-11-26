# p2-0 Methods Practice

(1) Write a program which uses two methods. One method, called getBabbage, returns the value of the Babbage Function, **y = x<sup>2</sup>+ x + 41**. The other is called isPrime and returns type boolean. It returns true if the number sent to it is prime and false  if the number is composite. For x values ranging from 35 to 50, generate the following table:

x|y|is y prime?
---|---|---
35|1301|yes
36|1373|yes
37|1447|yes
38|1523|yes
39|1601|yes
40|1681|no
41|1763|no
42|1847|yes
43|1933|yes
44|2021|no
45|2111|yes
46|2203|yes
47|2297|yes
48|2393|yes
49|2491|no
50|2591|yes

(2) Rewrite the Factorial program from earlier practice using a method to do the actual calculation. A single value is passed to the method. The method returns the factorial of the number.
The user types a positive integer (output an appropriate comment if the number is either negative or zero and let the user try again). Once a positive integer has been typed, compute and output the factorial of that number. A factorial is the product of the whole numbers up to and including the input number.
```
Input = 6		Factorial = 1 x 2 x 3 x 4 x 5 x 6 = 720
Input = 9		Factorial = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 = 362880
```

(3) Use method overloading to write several versions of a *max* method which:
 * Takes 2 integers and returns the largest integer
 * Takes 3 integers and returns the largest integer
 * Takes 2 doubles and returns the largest double
 * Takes 3 doubles and returns the largest double
