package org.strategydesignpattern.withinterfaces;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public abstract class Car {

    public abstract void name();
    public void tyres(){
        System.out.println("Car had apollo tyres");
    }

    public void headLamps(){
        System.out.println("we are using head lamps");
    }

}
