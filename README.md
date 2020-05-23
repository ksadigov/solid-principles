![Image](images/solid.png)


**SOLID design principles encourage us to create more maintainable, understandable, and flexible software.**


#### (S) Single Responsibility Principle

-   This principle states that a class should only have one responsibility. 
    Furthermore, it should only have one reason to change.
-   This principle deals specifically with **cohesion**.
- Benefits
   - Testing – A class with one responsibility will have far fewer test cases
   - Lower coupling – Less functionality in a single class will have fewer dependencies
   - Organization – Smaller, well-organized classes are easier to search than monolithic ones 

#### (O) Open/Closed Principle

-   Classes should be open for extension, but closed for modification. 
    In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an 
    otherwise happy application.
-   In detail, it says that we can extend the behavior of a class, when necessary, 
    through **inheritance**, **interface** and **composition**, 
    but we cannot allow the opening of this class to make minor modifications.

#### (L) Liskov Substitution Principle

-   This principle was described by the researcher Barbara Liskov in her 1988 paper, 
    which explains that before choosing to inherit, we need to think about the preconditions and postconditions of her class.
-   If class A is a subtype of class B, then we should be able to replace B with A without disrupting 
    the behavior of our program.
    
#### (I) Interface Segregation Principle
-   Many specific interfaces are better than a general interface.
-   This principle deals with **cohesion** in interfaces.
-   Make fine grained interfaces that are client specific.
-   Larger interfaces should be split into smaller ones. By doing so, 
    we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
    
#### (D) Dependency Inversion Principle
-   Depend on abstractions and not on concrete classes.
-   High-level modules should not depend on low-level modules. Both should depend on abstractions.
-   Abstractions should not depend on details. Details should depend on abstractions.
-   The principle of Dependency Inversion refers to the decoupling of software modules. 
    This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.