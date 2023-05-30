# Observer Design Pattern

Just Imagine we are working in the monitoring based company. we have a monitoring tool that receives data from the various external devices. 

### Requirement : 
 
For that received data from various devices, we need to create a different views and user should have the flexibility to add and remove the views at any point of time. 
Initially we have three views. 

1. Metric Processing 
2. Synthetic Monitoring 
3. Alert Processing 


### Initial Design

Initially we come with the below-mentioned design 

![Initial Design](https://github.com/venkatchinmay/design_patterns/blob/master/src/main/java/org/observerdesignpattern/initialdesign/initialdesign.png)


Let's Analyse the drawbacks of our Initial Design: 

To Add or Remove any View (For add or Remove the concrete classess of the create view Interface) we need to Touch the Metric Data class.
It will create two problems. 

1. There is a tight coupling between the Views and Metric Data classess. Let's Imagine In future User will create the 1000 views, it is very difficult to maintain the code
2. what if we need to add the views during Runtime, This looks hard coded.

### Final Design

To overcome from the above problems, we brainstorm and we will decide to Implement the Observer Design Pattern. 

### Observer Design Pattern

Observer design pattern works like publisher + subscribers model. 

For Example if you take subscription for our blog, if any new posts published, you will be notified, if you unsubscribe, you will not notified.
In the similar way, Observer pattern works.

Here we are notified as Subject (Blog writer) and you will be notified as Observer (Subscriber).

Let's discuss how we apply this Observer design pattern for our monitoring application.

Metric Data is the Subject, views are the Observers

we can add and remove the Observer at any point of time. 

![Final Design](https://github.com/venkatchinmay/design_patterns/blob/master/src/main/java/org/observerdesignpattern/finaldesign/finaldesign.png)

In the above design we observed below points 

### Oops Basics covered in this design

1. Inheritance 

```java
public class MetricProcessing implements View, Observer {
    
}
```

2. Abstraction And Encapsulation

```java
 private static List<Observer> observers = new ArrayList<>();
```

### Oops principles covered in this design 

* **Encapsulate what varies**
  
  In this pattern state of the subject and number of observers are always changes, we can vary the number of observers without changing the Subject
  
  In this application, every time we are receiving the new metric data and we can capable to create the more number of views without changing the Metric Data
* **Favourable Composition Over inheritance**
  we can capable to compose the any number of observers, they can set up even at runtime
* **Program to interfaces, not for Implementations** 
  In this pattern, Subject is the Interface and Observer is the Interface. Subject can keep track of all Observers like
   adding,removing and notifying 

**_**Observer design pattern defines a one-to-many relationship dependency between objects, If state changes in Subject, and it notified to all its dependents and they are loosely coupled**_**

**CODE FOR COMPLETE IMPLEMENTATION** : https://github.com/venkatchinmay/design_patterns/tree/master/src/main/java/org/observerdesignpattern