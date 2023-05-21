package org.strategydesignpattern.withinterfaces;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public class Alto extends Car implements Engine, Fuel, Gear{
    @Override
    public void name() {
        System.out.println("Alto car");
    }

    @Override
    public void engine(){
        System.out.println("it has simple petrol engine");
    }

    @Override
    public void isAutoGear() {
        System.out.println("it has Normal gear");
    }

    @Override
    public void fuel() {
        System.out.println("petrol");
    }
}
