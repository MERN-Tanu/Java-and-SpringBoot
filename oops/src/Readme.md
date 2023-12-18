Leraning Resources : Java Bootcamp Resources : 

```
https://github.com/rslim087a/Java-Bootcamp-Resources/tree/main/Module%202%20-%20Object%20Oriented%20Programming
```

The Equal Method In Java : 

By default, the equals method compares the references of two objects, as demonstrated in the following code:

```java
Person person = new Person("John", 30);

boolean areEqual = person.equals(new Person("John", 30)); // false

```

Even though person and the target object have the same name and age,
the equals method returns false because it compares their references, not their content.

# The relationship between equals and contains.

The default behavior of the equals method causes issues when working with the contains method of a List.

The contains method relies on the equals method to determine if an object is present in the list:

```java
Person john = new Person("John", 30);
Person amy = new Person("Amy", 28);
Person sasha = new Person("Sasha", 29)


List<Person> personList = new ArrayList<>();
personList.add(john);
personList.add(amy);
personList.add(sasha);
                                         // target 
boolean isPresent = personList.contains(new Person("John", 30)); 
System.out.println(isPresent);

```
```

• OUTPUT

»: false


```

Difference between Equal and Contain() Method :

The equals() method checks if two strings are equal character-by-character and returns a boolean value – true if they are equal and false if not.
The contains() method checks if a certain sequence of characters is present within a string. This method returns a boolean value – true if the sequence is found, and false if not.
Here is an example of how to use the equals() method:

```java
String str1 = "Hello, World!";
String str2 = str1;

if (str1.equals(str2)) {
  System.out.println("The strings are equal.");
} else {
  System.out.println("The strings are not equal.");
}
```

This code will print "The strings are equal." because str1 and str2 reference the same object.
Here is an example of how to use the contains() method:

```java
String str1 = "Hello, World!";

if (str1.contains("World")) {
  System.out.println("The string contains the word 'World'.");
} else {
  System.out.println("The string does not contain the word 'World'.");
}
```

Exceptional Handling :

Introduction to Compile Time Exceptions
As a programmer, you will inevitably come across situations where things go wrong. When errors occur during the execution of a program, they often lead to exceptions. In Java, these exceptions are classified into two types: Compile-Time exceptions (also known as Checked exceptions) and Runtime exceptions (Unchecked exceptions). Understanding these concepts is crucial when writing robust, fault-tolerant programs.
Compile-time exceptions are predictable failures that your compiler checks before executing your code. They're called 'checked' because the compiler checks at compile time to see if these exceptions have been properly handled with a try-catch block or if they have been declared to be thrown. If not, the code will fail to compile.
Runtime exceptions, on the other hand, are typically the result of logic errors in your code and are usually avoidable. These exceptions occur during the execution of the program and the compiler does not check for their presence.
Here's a simple comparison:

```java
Consider this example, which attempts to open a file named greetings.txt using FileInputStream:
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;


        public class Main {
        public static void main(String[] args) {
        // this code will not compile! 
        FileInputStream fis = new FileInputStream("greetings.txt");
        }
        }

        When you try to compile this code, you'll receive a compile-time error because the code is vulnerable to a checked FileNotFoundException. Because it's a checked exception, Java forces you to handle this exception using a try-catch block.


```

**Handling Compile-Time Exceptions :**

Java allows handling these unavoidable exceptions using try-catch blocks.
For instance, let's modify the file opening example to handle the potential FileNotFoundException:

```
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream("greetings.txt");
} catch (FileNotFoundException e) {
System.out.println("File not found!");
}
}
}
```
In the example above, the try block contains the code that's vulnerable to a checked exception,
while the catch block handles it. If a FileNotFoundException occurs within the try block,
execution immediately transfers to the corresponding catch block, preventing the application from crashing.

```java
https://www.learnthepart.com/course/2e619a47-76f5-444e-8e86-e712631518a7/55555acf-2d89-4a78-95af-c6dccc8dc11b
```

**Map vs HashMap**

```java
https://www.learnthepart.com/course/2e619a47-76f5-444e-8e86-e712631518a7/87acc410-ed89-4503-be7a-d29bf061dfb8
```

