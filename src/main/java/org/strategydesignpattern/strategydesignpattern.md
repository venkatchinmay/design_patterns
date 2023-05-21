# Strategy Design Pattern 

Let's Imagine we are in the Car Development Software Company and we are having Car Company initial Design like this

### Initial Design of the Software

![intialDesign](/home/chinmay/git_projects/My_projects/design_patterns/src/main/java/org/strategydesignpattern/initialdesign/initialdesign.png) 

we implemented the all features of car like fuel,engine,tyres and head lamps etc ....

Later Board Members Decided to implement new feature "**Auto gear**" which is highly demandable feature in market and ask Managers to implement in software 
and come with Demo with in one week.

Managers assigned this task to one of the developer to implement the "**Auto gear**" feature. Developer Said that I am OOps programmer and I will Implement this feature with in an hour and come with the design like this

### Initial Implementation of Auto gear : 


![AutoGear](/home/chinmay/git_projects/My_projects/design_patterns/src/main/java/org/strategydesignpattern/implementautogear/implementautogear.png) 

Manager start giving demo in front of the Board members and they surprised that **Ambassador** and **Alto** had **Auto gear** Feature and they decided that we can't afford this feature to these cars and asked manager to remove Auto gear feature in these cars.

Manager asked developer to remove "**Auto gear** feature in **Ambassador** and **Alto** cars. 

Developer thinking that how to remove the **Auto gear** feature in **Ambassador** and **Alto** cars, Since he is OOps programmer, **overriding the isAutoGear() method** will solve the problem.  

During this Implementation process,Board members decided to implement **different kinds of engines in different cars**.
when engines are different then automatically **fuels also different** and ask the manager and developer to implement the same in the software.

Developer taught that specs are changing in every board meeting and he comes with the design like this

### Design with Interfaces

![interfaces](/home/chinmay/git_projects/My_projects/design_patterns/src/main/java/org/strategydesignpattern/withinterfaces/withinterfaces.png) 

Developer brings this design to manager to review. Manager asked the Developer, **Is it perfect design to Implement our specs ?**

**what is your taught process on this ..... Is there any drawback on above design ?**

### Draw backs of above design  

**Imagine we have 100 car types Instead of 4 in future** 
we need to **override** Engine,Gear and Fuel Interface methods in every class, it causes
  * Duplicate code across sub classess
  * If something changes, we need to change in every class, huge chances to get issues.
  * Maintaining of code is very difficult
  * Hard to gain knowledge over Car behaviours and Run time changes also difficult.

### Strategy pattern 

Later Developer made a brainstorm and observed what are the specs **frequently changing and noted their behaviours** and he also observed what are **specs not changing** in Car and he made a list like this 

* **changed specs** :
  1. engine 
  2. fuel
  3. gear
  
* **unchanged specs** :
  1. tyres
  2. head lamps
  
and **he encapsulated the changed specs in Car class** and he made a final design like this.

![strategypattern](/home/chinmay/git_projects/My_projects/design_patterns/src/main/java/org/strategydesignpattern/finalstrategypattern/finalStrategyPattern.png) 

 

**_"Observed the behaviour of the class and Encapsulate what is changing frequently. This pattern is called strategy pattern"_**

### Object oriented basics covered in this pattern

* Abstraction
* Encapsulation
* Polymorphism
* Inheritance

### Object oriented principles we followed in this pattern 

* Encapsulate what varies 
* Favourable Composition Over inheritance 
* Program to interfaces, not for Implementations 

```java
//encapsulation and abstraction and Program to interfaces
    private Engine engine ;
    private Fuel fuel;
    private Gear gear;

    // polymorphism
        Engine engine = new SimplePetrolEngine();
        setEngine(engine);
        Fuel fuel = new Petrol();
        setFuel(fuel);
        Gear gear = new NormalGear();
        setGear(gear);
```